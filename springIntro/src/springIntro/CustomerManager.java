package springIntro;

public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	//generate constructor using fields
	//CustomerManager parametre olarak bir ICustomerDal istiyor ve onun add()'ini �al��t�r�yor
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		//i� kurallar�
		//customerDal.add();
		// i� kurallarindan ge�iyorsa git ve customerDal'da ki db eklemeyi �a��r.
	}
}
