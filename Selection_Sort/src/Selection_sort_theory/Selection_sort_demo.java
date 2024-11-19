package Selection_sort_theory;

public class Selection_sort_demo {

	public static void main(String[] args) {
		int[] a = {29, 30, 9, 5, 4};
		int minimum_index;
		int temp;

		for (int i = 0; i < a.length - 1; i++)           
		{
		          minimum_index = i;                       
		       for (int j = i + 1; j < a.length; j++)        
		       {
		               if (a[j] < a[minimum_index])           
		               {
		                     minimum_index = j;                   
		               }
		       }
		       
		          temp = a[minimum_index];        
		          a[minimum_index] = a[i];              
		          a[i] = temp;                     
		}

		    for (int k = 0; k < a.length; k++) 
		      {
		       System.out.println(a[k]);
		      }

	}

}
