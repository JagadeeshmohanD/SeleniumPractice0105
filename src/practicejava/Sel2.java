package practicejava;

public class Sel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sum of numbers in the array
//printing the index of desired number
		int sum=0;
		int a[]= {2,5,8,7,4,6,3};
		for (int i=0;i<a.length;i++) 
		{
			//System.out.println(a[i]);
			//sum=sum+a[i];
			if(a[i]==7) {
				System.out.println(i);
				break;
			}
		}
		//System.out.println(sum);
	}

}
