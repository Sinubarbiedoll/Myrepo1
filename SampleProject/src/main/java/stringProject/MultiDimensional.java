package stringProject;

public class MultiDimensional {
	

	public static void main(String[] args) {
		
		int a[][] = {{3,5,7,2}, {4,5,8,5},{8,5,6,9}};
		System.out.println("the length of a[0] is"+a[0].length);
		System.out.println("the length of a[1] is"+a[1].length);
		System.out.println("the length of a[2] is"+a[2].length);

		for(int i = 0; i<a.length;i++)
		{	

			for(int j = 0; j<a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
			
		// TODO Auto-generated method stub

	}

}