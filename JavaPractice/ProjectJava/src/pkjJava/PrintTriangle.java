package pkjJava;

public class PrintTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,j,k;
		
		for(i=1;i<=5;i++)
		{
		//	System.out.println();
			
		    for(j=5;j>i;j--)
		    {
		    	System.out.print("^");
		    		    	
		    }
		    
		    for(k=1;k<(i*2);k++)
		    {
		    	
		    	System.out.print("*");
		    }
			/*for(j=1;j<=5;j++)
			{
				System.out.print("*");
			}
			*/
		System.out.println();
		}
	}

}
