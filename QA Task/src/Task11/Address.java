package Task11;

public class Address 
{
	protected Address(String line1, String line2, String city, String postcode) 
	{
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.postcode = postcode;
	}
	String line1;
	String line2;
	String city;
	String postcode;
	
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostcode() {
		return postcode;
	}
	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}
}