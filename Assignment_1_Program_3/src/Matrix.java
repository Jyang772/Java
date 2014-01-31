//Justin Yang
//Assignment_1_Program_3
//1/20/14



public class Matrix {

	public static void main(String[] args) {
	
	
		int matrix [][] = {
						{1,2,3},
						{4,5,6},
						{7,8,9}
							};
		
		System.out.println("This is your current matrix: ");
		
		display(matrix);
		
		matrix = rotate_right(matrix);
		System.out.println();
		reset(matrix);
		display(matrix);
		matrix = rotate_left(matrix);
		reset(matrix);
		
		display(matrix);
		
	}
	
	
	
	
	
	private static void reset(int[][] matrix) {
		System.out.println("Reseting matrix\n");
		int z = 1;
		for(int i=0; i<=2; i++)
		{
			for(int j=0; j<=2; j++)
			{
				matrix[i][j] = z;
				z++;
			}
		}
	}





	private static int [][] rotate_left(int[][] matrix) {

		System.out.println("Rotating to left 90 degrees: ");
		int new_matrix [][] = new int [matrix.length][matrix.length];
		
		
		for(int i=2; i >= 0; i--)
		{
			int z = 2;
			for(int j = 0; j <= 2; j++)
			{
				new_matrix[z][i]=matrix[i][j];
				z--;
			}
			
		}
		
		
		for(int i=0; i < new_matrix.length; i++)
		{
			for(int j=0; j<new_matrix.length; j++)
			{
				System.out.print(new_matrix[i][j]);	
			}
			System.out.println();
		}
		return new_matrix;
	}

	private static void display(int[][] matrix) {
		System.out.println("Current view: ");
		for(int i=0; i < matrix.length; i++)
		{
			for(int j=0; j < matrix.length; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
	}



	

	public static int[][] rotate_right(int [][] matrix)
	{
		System.out.println("Rotating to right 90 degrees: ");
		int new_matrix [][] = new int [matrix.length][matrix.length];
		int z = 0;
		
		for(int i=2; i >= 0; i--)
		{
			for(int j=0; j<=2; j++)
			{
				new_matrix[j][z] = matrix[i][j];
			}
		z++;
		}

		for(int i=0; i < new_matrix.length; i++)
		{
			for(int j=0; j<new_matrix.length; j++)
			{
				System.out.print(new_matrix[i][j]);	
			}
			System.out.println();
		}
		return new_matrix;
	}

}
