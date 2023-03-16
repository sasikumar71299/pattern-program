package pattern_program;

public class Program_2 {

	public static void main(String[] args) {
		Program_2 obj= new Program_2();
		obj.alphabet_s();
		obj.alphabet_a();
		obj.alphabet_s();
		obj.alphabet_i();
	    obj.alphabet_k();
	    obj.alphabet_u();
	    obj.alphabet_m();
		obj.alphabet_a();
		obj.alphabet_r();
	}

	private void alphabet_m() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				
				if(col==1 || col==9)
				{
					
					System.out.print("*");
				}
				else if(row==col || row+col==10)
				{
					if(row<=5)
					{
						System.out.print("*");
					}
				
				else
				{
					System.out.print(" ");

				}
				}
				
//				else if(row<=5)
//				{
//					if(row==col || row+col==10 )
//					{
//						System.out.print("*");
//					}
//				}
				
				else
				{
					System.out.print(" ");

				}
			}
			System.out.println();
	}
	}

	private void alphabet_u() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(col==1 || col==9 )
				{
					if(row<=8)
					{
						System.out.print("*");
					}
				
				else
				{
					System.out.print(" ");
				}
			}
				 if(row==9)
				{
					if(col>1 && col<=8)
					{
						System.out.print("*");

					}
				}
					else
					{
						System.out.print(" ");
					}
				}
				System.out.println();
		}
	}
	

	private void alphabet_k() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
//				if(col==5 || row+col==10 || row==col)
//				{
//					
//				 System.out.print("*");
//				}
//				else
//			        {
//						System.out.print(" ");
//					}
//					
//				}
				if(col==1 || row+col==7)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				for(int i=2;i<=5;i++)
				{
					if(row==i+4 && col==i)
					{
						System.out.print("*");
					}
				}
			}
	       
			System.out.println();
		}
	}
	

	private void alphabet_i() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==9 || col==5 )
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

	private void alphabet_r() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==5 || col==1 )
				{
					System.out.print("*");
				}
				
				else if(col==9)
				{
					if(row<=5)
					{
						System.out.print("*");
					}
				}
//				else if(row>=5 && col>=1)
//				{
//					if(row+col%2==0)
//					{
//						System.out.print("*");
//					}
//				}
				else {
					System.out.print(" ");
				}
				for(int i=2;i<=5;i++)
				{
					if(row==i+4 && col==i)
					{
						System.out.print("*");
					}
				}
			}
			System.out.println();
	}}

	private void alphabet_a() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==5 || col==1 || col==9)
				{
					System.out.print("*");
				}
//				else  if(col==1 || col==9)
//				{
//						System.out.print("*");		
//			}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
			
		
		
	}

	private void alphabet_s() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || row==5 || row==9)
				{
					System.out.print("*");
				}
				else if(row<=4)
				{
					if(col==1)
					{
					System.out.print("*");
					}
				}
			else if(col==9 )
			{
					if(row>=5)
					{
					System.out.print("*");
					}
				}
				else
				{
					System.out.print(" ");
	
				}
				
			}
			System.out.println();
		}
	}
	}


