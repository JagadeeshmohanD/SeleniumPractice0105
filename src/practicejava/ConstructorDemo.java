package practicejava;

public class ConstructorDemo {
//constructor will not return any values
//name of constructor name should be class name
	public ConstructorDemo()
	{
		System.out.println("i am in the constructor");
		System.out.println("welocme to constructor");
	}
	//Parameterized constructor
	public ConstructorDemo(int a,int b)
	{
		System.out.println("i am in parametrized constructor");
		int c= a+b;
		System.out.println(c);
	}
	public ConstructorDemo(String str)
	{
		System.out.println(str);
	}
	public void getdata()
	{
		System.out.println("i am the method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//compiler will call default constructor
       ConstructorDemo cd = new ConstructorDemo();
       ConstructorDemo c = new ConstructorDemo(4,5);
       ConstructorDemo s = new ConstructorDemo("Hello");
       
	}

}
