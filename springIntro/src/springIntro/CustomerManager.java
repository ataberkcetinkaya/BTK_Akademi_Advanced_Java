package springIntro;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	//generate constructor using fields
	//CustomerManager parametre olarak bir ICustomerDal istiyor ve onun add()'ini çalýþtýrýyor
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iþ kurallarý
		//customerDal.add();
		// iþ kurallarindan geçiyorsa git ve customerDal'da ki db eklemeyi çaðýr.
	}
}
