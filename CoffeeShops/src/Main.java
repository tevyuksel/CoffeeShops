
import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concretes.NeroCustomerManager;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer ty = new Customer();
		ty.setId(1);
		ty.setFirstName("Tevhid");
		ty.setLastName("Yüksel");
		ty.setNationalityId("1111111111");
		ty.setBirthDate(1994);
		
		BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager1.save(ty);
		System.out.println("------------------------------------");
		BaseCustomerManager customerManager2 = new NeroCustomerManager(new MernisServiceAdapter());
		customerManager2.save(ty);
	}

}
