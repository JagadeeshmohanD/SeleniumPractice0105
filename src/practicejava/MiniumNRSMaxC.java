package practicejava;

public class MiniumNRSMaxC {
//Find Minimum Number in Row and display Max number in the same column
	/* 2 4 5
	 * 3 4 7
	 * 1 2 9
	 */
	/* 1.identify Minimum number in row
	 * 2.identify the column of minimum number
	 * 3.check for max in the same column
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min =abc[0][0];
		int mincolumn =0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//minium number in array
				if(abc[i][j]<min) {
					min=abc[i][j];
					mincolumn=j;
				}
			}
		}
		int max =abc[0][mincolumn];
		int k=0;
      while(k<3) {
    	  if(abc[k][mincolumn]>max) {
    		  max=abc[k][mincolumn];
    	  }
    	  k++;
      }
      System.out.println(max);
	}

}
