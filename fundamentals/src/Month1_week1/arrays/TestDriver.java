package Month1_week1.arrays;

public class TestDriver {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[3];
		arr[0] = 10;
		for(int i: arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		int []a = {1,2,3,4,5};
		int b[] = new int[10];
		for(int i=0;i<b.length;i++)
		{
			b[i] = i*10;
		}
		for (int i : b) {
			System.out.print(i+" ");
		}
		
		
		int[][] matrix = new int[3][3];
		for(int i=0;i<matrix.length;i++)
		{
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		int[][] jagged = new int[3][];
		
		jagged[0] = new int[1];
		jagged[0][0] = 1;
		jagged[1] = new int[3];
		jagged[1][0] = 2;
		jagged[1][1] = 3;
		jagged[1][2] = 4;
		jagged[2] = new int[2];
		jagged[2][0] = 5;
		jagged[2][1] = 6;
		for(int[] k: jagged)
		{
			for(int f:k)
			{
				System.out.print(f+" ");
			}
			System.out.println();
		}
	}

}
