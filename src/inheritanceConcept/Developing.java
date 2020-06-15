package inheritanceConcept;

public class Developing implements BankingClient,Domainclient {
//now this class is responsible to implement all metho of bankingclient
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Developing d = new Developing();
d.paycreditcard();
d.transferbalance();
d.checkingbalance();
d.login();
BankingClient dr = new Developing();//Run time polymorphisim
Domainclient ds = new Developing();
ds.investment();
	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		System.out.println("Paycredit implement");
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		System.out.println("transferbalance implement");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		System.out.println("checkingbalance implement");
	}
 public void login()
 {
	 System.out.println("logging");
 }

@Override
public void investment() {
	// TODO Auto-generated method stub
	System.out.println("investment implement");
	
}
}
