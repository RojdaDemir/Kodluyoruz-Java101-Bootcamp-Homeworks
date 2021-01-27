package question4.insurancecompany.Address;

public class HomeAddress implements Address{

	 private final String addressName ="Ev adresi";
	 private String street;
	 private String district;
	 private String city;
	 private int zipCode;
	
	 public HomeAddress() 
	   {
		 
		 this.street = "";
		 this.district = "";
		 this.city = "";
		 this.zipCode = 0;
				
	   }
	
     public HomeAddress(String street, String district, String city, int zipCode) 
       {
    	 this.street = street;
    	 this.district = district;
    	 this.city = city;
    	 this.zipCode = zipCode;
       }
	
	   public String getStreet() {
		return street;
	    }

	    public void setStreet(String street) {
		this.street = street;
	    }

	   public String getDistrict() {
		return district;
	    }

	   public void setDistrict(String district) {
		this.district = district;
	    }

	   public String getCity() {
		return city;
	    }

	   public void setCity(String city) {
		this.city = city;
	   }

	   public int getZipCode() {
		return zipCode;
	   }

	   public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	   }

	   
    @Override
	public String toString() {
		
    	StringBuilder builder = new StringBuilder();
    	builder.append(this.addressName);
    	builder.append(" = ");
        builder.append("[ ");
        builder.append(this.street);
        builder.append(", ");
        builder.append(this.district);
        builder.append(", ");
    	builder.append(this.city);
    	builder.append(", ");
    	builder.append(this.zipCode);
    	builder.append(" ]");
    	
    	return builder.toString();
	}

	@Override
	public void addressPrint() {
		
		toString();
		
	}

}
