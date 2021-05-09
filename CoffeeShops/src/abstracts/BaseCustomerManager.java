package abstracts;

import entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Save to DB : " + customer.getFirstName());
		System.out.println("1 hediye kahve kazandýn -> " + customer.getFirstName());
		
	}

}
