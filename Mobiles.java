class Mobile{
	String brand;
	String model;
	double price;
	Mobile(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	void details(){
		System.out.println("Brand: "+brand);
		System.out.println("Model: "+model);
		System.out.println("Price: "+price);
	}
}
public class Mobiles{
	public static void main(String[] args){
		Mobile m1=new Mobile("Nothing","2a",22000.0);
		Mobile m2=new Mobile("One Plus","Nord CE 4",23000.0);
		Mobile m3=new Mobile("iPhone","16",650000.0);
		System.out.println("Mobile 1 details:");
		m1.details();
		System.out.println("Mobile 2 details:");
		m2.details();
		System.out.println("Mobile 3 details:");
		m3.details();
	}
}