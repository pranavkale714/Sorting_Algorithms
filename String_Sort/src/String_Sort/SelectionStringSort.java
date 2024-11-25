package String_Sort;

public class SelectionStringSort {

	public static void main(String[] args) {
		 String[] a = {"kael", "pranav", "dilip", "kale"};   //Case Sensitive
	     int minimum_index;  
	      String temp;

	    for (int i = 0; i < a.length; i++)
	    {
	        minimum_index = i;
	       for (int j = i + 1; j < a.length; j++) 
	        {
	             if (a[j].compareTo(a[minimum_index]) < 0) {
	                   minimum_index = j;
	                 }
	        }
	      temp = a[i];
	      a[i] = a[minimum_index];
	      a[minimum_index] = temp;
	    }

	         for (int i = 0; i < a.length; i++) 
	         {
	               System.out.println(a[i]);
	         }

	}

}
