public class Pyramid10 
{
	public static void main(String[] args) 
	{
		
		for(int i=6;i>=1;i--)
		{
			if(i==6||i==1)
				for(int j=1;j<=i;j++)
				{
					System.out.print("*");
				}
				
			else
			{
				for(int k=1;k<=i;k++)	
				{
					if(k==i||k==1)
					{
						
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				
			}
		  System.out.println(" ");
		 
		  
     }
  }
}