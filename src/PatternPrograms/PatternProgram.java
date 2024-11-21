package PatternPrograms;


public class PatternProgram {


	
	
	static void pattern1(int n)
	{
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****

		*/
		for(int i=1;i<=n;i++)
		{
			//for every row, run the col
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();	//Go on next line
		}

	}
	
	static void pattern2(int n)
	{
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)	
			{	
				System.out.print("*");	
			}
			System.out.println();	//Go on next line
		}

	}
	
	
	static void pattern3(int n)
	{
		/*
		 
		 1
		 12
		 123
		 1234

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)	
			{	
				System.out.print(j);	
			}
			System.out.println();	//Go on next line
		}

	}
	
	static void pattern4(int n)
	{
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 ****
		 ***
		 **
		 *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=1;j<=i;j++)	
			{
				System.out.print("*");	
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) 
		{
			
			for(int j=n-1;j>=i;j--)	
			{
				System.out.print("*");	
			}
			System.out.println();
		}	
		
	}
	
	
	static void pattern5(int n)
	{
		/*
		 
		 	 *
		 	**
		   ***
		  ****
		 *****

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n-1;j>=i;j--)	
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pattern6(int n)
	{
		/*
		 
		 *****
		  ****
		   ***
		    ** 
		     *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)	
			{
				System.out.print(" ");	
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern7(int n)
	{
		/*
		  	 *
		 	**
		   ***
		  ****
		 *****
		  ****
		   ***
		    ** 
		     *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n-1;j>=i;j--)	
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)	
			{
				System.out.print(" ");	
			}
			for(int k=n-1;k>=i;k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	static void pattern8(int n)
	{
		/*
		  	 *
		  	* *
		   * * *
		  * * * *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)	
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
	
	static void pattern9(int n)
	{
		/*
		  	 *
		  	***
		   *****
		  *******

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)	
			{
				System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	static void pattern10(int n)
	{
		/*
		  	 
		  *******
		   *****
		  	***
		     *

		*/
		
		//Way1
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)	
			{
				System.out.print(" ");	
			}
			for(int k=n;k>=i;k--)
			{
				System.out.print("*");
			}
			for(int l=n-1;l>=i;l--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		//Way2
		for(int i=5;i>=1;i--) 
		{
			for(int j=5;j>=i;j--)	
			{
				System.out.print(" ");	
			}
			for(int k=1;k<i*2;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	
	static void pattern11(int n)
	{
		/*
		  	 *
		  	  *
		       *
		        *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=1;j<=i;j++)	
			{
				if(i>=2 && j<=i-1)
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	
	static void pattern12(int n)
	{
		/*
		  	 *
		  	*
		   *
		  *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)	
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	static void pattern13(int n)
	{
		/*
		  	 *
		  	* *
		   *   *
		  *     *

		*/
		
		for(int i=1;i<=n;i++) 
		{
			for(int j=n;j>=i;j--)	
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	static void pattern14(int n)
	{
		/*
		  	*     *
		  	 *   *
		  	  * *
		  	   *

		*/
		
		for(int i=n;i>=1;i--) 
		{
			for(int j=n;j>=i;j--)	
			{
				System.out.print(" ");
			}
			for(int k=1;k<(i*2);k++)
			{
				if(k>1 && k<(i*2)-1)
				{
					System.out.print(" ");	
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	static void pattern15(int n)
	{
		/*
		  	*     *
		  	 *   *
		  	  * *
		  	   *
		  	  * *
		  	 *   *
		  	*     *

		*/
		
		for(int i=0;i<n;i++) 
		{
			for(int j=0;j<n;j++)	
			{
				if(i==j || i+j==n-1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	static void pattern16(int n)
	{
		/*
		  	 ****
		  	 *  *
		  	 *  *
		  	 ****
		  	 
		*/
		
		for(int i=1;i<=5;i++) 
		{
			for(int j=1;j<=5;j++)	
			{
				if(i>=2 && j>=2 && i<=4 && j<=4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) 
	{
		//pattern1(5);
		//pattern2(5);
		//pattern3(4);
		//pattern4(4);
		//pattern5(4);
		//pattern6(4);
		//pattern7(4);
		//pattern8(4);
		//pattern9(4);
		//pattern10(4);
		//pattern11(4);
		//pattern12(4);
		//pattern13(4);
		//pattern14(4);
		//pattern15(5);
		pattern16(4);
	}
	

}
