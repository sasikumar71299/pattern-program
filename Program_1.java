package pattern_program;

public class Program_1 {

	public static void main(String[] args) {
		Program_1 obj= new Program_1();
		obj.alphabet_t();
	}

	private void alphabet_t() {
		for(int row=1;row<=9;row++)
		{
			for(int col=1;col<=9;col++)
			{
				if(row==1 || col==5)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
