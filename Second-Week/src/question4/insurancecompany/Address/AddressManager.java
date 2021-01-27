package question4.insurancecompany.Address;

import java.util.ArrayList;
import java.util.List;

import question4.insurancecompany.User.User;

public class AddressManager {

	public static User customAddressAdd(User user, Address address) {
	  
		while(user != null) {
		List<Address> addressList = new ArrayList<Address>();
		addressList.add(address);
		user.setAdresListesi(addressList);
	    System.out.println("Verilen adres eklendi."); 	
	}
		return user;
	}	
	public static User customAddressRemove(User user,Address address) {
	
		while(user != null) {
		
		    user.getAdresListesi().remove(address);
		}
		return user;	
	}
	
}
