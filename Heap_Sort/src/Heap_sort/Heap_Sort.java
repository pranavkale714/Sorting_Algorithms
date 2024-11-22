package Heap_sort;

public class Heap_Sort {

		    public static void main(String[] args) {
		       int[] arr={22,13,17,11,10,14,10};
		       Heap_Sort hs=new Heap_Sort();
		       hs.sort(arr);
		       hs.printArray(arr);
		    }
		    
		    void sort(int[] arr)
		    {
		        int leng=arr.length;
		        
		        for(int i=leng/2-1;i>=0;i--)    
		        //i=right subtree index  i=2
		        {
		            heapify(arr,leng,i);
		        }
		        
		        //swap the elements and heapify again
		        for(int i=leng-1;i>=0;i--)
		        {
		            int temp=arr[0];
		            arr[0]=arr[i];
		            arr[i]=temp;
		            
		            heapify(arr,i,0);
		        }
		    }
		    
		    void heapify(int[] arr,int n,int i)
		    {
		        int largest=i; //parent note index position
		        int li=2*i+1;   //left child node index position
		        int ri=2*i+2;      //right child node index
		        if(li<n && arr[li]>arr[largest])
		        {
		            largest=li;
		        }
		        if(ri<n && arr[ri]>arr[largest])
		        {
		            largest=ri;
		        }
		        if(largest!=i)
		        {
		            int temp=arr[i];
		            arr[i]=arr[largest];
		            arr[largest]=temp;
		            
		            heapify(arr,n,largest);
		        }
		    }
		    void printArray(int[] arr)
		    {
		        for(int i=0;i<arr.length;i++)
		        {
		            System.out.print(arr[i]+" ");
		        }
		    }
		}