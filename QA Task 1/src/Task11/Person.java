package Task11;

public class Person 
{
	protected Person(String name, Address address, String email, String phoneNum) 
	{
		this.name = name;
		this.address = address;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	String name;
	Address address;
	String email;
	String phoneNum;
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Address getAddress() 
	{
		return address;
	}
	public void setAddress(Address address) 
	{
		this.address = address;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getPhonenum() 
	{
		return phoneNum;
	}
	public void setPhonenum(String phonenum) 
	{
		this.phoneNum = phonenum;
	}
}