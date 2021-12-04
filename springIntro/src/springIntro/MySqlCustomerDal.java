package springIntro;

public class MySqlCustomerDal implements ICustomerDal {

	@Override
	public void add() {
		System.out.println("Saved to MySql.");
		
	}

}
