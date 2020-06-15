package practicejava;

public class InterviewMiniumNumber {
/* 2 4 5
 * 3 4 7
 * 1 2 9
 */
	//Minimum and maximum number in array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,5},{3,4,7},{1,2,9}};
		int min =abc[0][0];
		int max =abc[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				//minium number in array
//				if(abc[i][j]<min) {
//					min=abc[i][j];
//				}
				//maximum number in array
				if(abc[i][j]>max) {
					max=abc[i][j];
				}
			}
		}
       // System.out.println(min);
		System.out.println(max);
	}

}
