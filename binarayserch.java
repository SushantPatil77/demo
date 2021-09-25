package array2;

public class binarayserch {

	public static void main(String[] args) {
	 int a[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14};
	 int num=45;
	 int start=0;
	 int end=a.length-1;
	  while(true)
	  {
		  int mid=(start+end)/2;
		    if(a[mid]==num)
		  {
			  System.out.println("found at location="+mid);
			  break;
		  }
		  else
			  if(num>a[mid])
			  
			   start=mid+1;
			   else 
				   end=mid-1; 
			   
		  if(start>end)
		  {
			  System.out.println("loction is not found");
			  break;
		  }
					
			      
	  }

	
	}

}
