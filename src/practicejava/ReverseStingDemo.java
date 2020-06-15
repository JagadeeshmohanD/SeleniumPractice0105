package practicejava;

public class ReverseStingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pallendrom string reverse should be same
		String a = "Nitin";
		String r= "";
       for(int i=a.length()-1;i>=0;i--)
       {
    	   //System.out.println(a.charAt(i));
    	   r=r+a.charAt(i);
       }
       System.out.println(r);
       if(a.equalsIgnoreCase(r))
       {
       System.out.println("Given string is pallendrom" +" "+ r);
       }
       else {
    	   System.out.println("Given string is not pallendrom" +" "+ r); 
       }
	}

}
