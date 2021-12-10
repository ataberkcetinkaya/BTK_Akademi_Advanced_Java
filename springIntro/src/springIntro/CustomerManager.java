package springIntro;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//generate constructor using fields
	//CustomerManager parametre olarak bir ICustomerDal istiyor ve onun add()'ini çalýþtýrýyor
	//constructor injection
	public CustomerManager(ICustomerDal customerDal) { 
		this.customerDal = customerDal;
	}
	
	//setter injection
	public void setCustomerDal(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//iþ kurallarý
		//customerDal.add();
		// iþ kurallarindan geçiyorsa git ve customerDal'da ki db eklemeyi çaðýr.
	}
}
