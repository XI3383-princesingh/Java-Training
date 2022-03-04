package training;
//Demonstrate Java Comparisons (Comparator or Comparable) + equals()/hashcode()
public class Laptop implements Comparable<Laptop>{
	String ram;
	String brand;
	int price;
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Laptop(String ram, String brand, int price) {
		super();
		this.ram = ram;
		this.brand = brand;
		this.price = price;
	}
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Laptop [ram=" + ram + ", brand=" + brand + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Laptop lap) {
		// TODO Auto-generated method stub
		if(this.price>lap.price)
			return 1;
		
		return -1;
	}
	@Override
	public boolean equals(Object o)
	{
		Laptop lap=(Laptop)o;
		if(brand==lap.brand&&price==lap.price&&ram==lap.ram)
			return true;
		
		return false;
	}
	
	@Override
	public int hashCode()
	{
		int hc=price%10;
		return hc;
	}
	
	

}
