package practicejava;

public class MultidimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//multi dimensional arrays
		int a[][]= {{2,4,5},{3,4,7},{5,2,1}};
		for(int i=0;i<3;i++) //Row
		{
			for(int j=0;j<3;j++) //Column
			{
				System.out.println(a[i][j]);
			}
		}

	}

}
