package MyPackage;
import java.util.Random;
public class Bill {
	
	
	int ay;
	public int price;
	public int totalprice;
	public int countofprodforcustomer;
	public int pricefordelivery;
	
	public Bill() {
		price=300;
		countofprodforcustomer=2;
		pricefordelivery=20;
	}
	public int priceProd(int h,int w,int count) {
		 int price=50*h*count;
		// if(price>600)
		//	 price=discountInPrice10(price,10);
		
		return price;
	}
	public int totalPriceofproduct(int h,int w,int count) {
		 
		totalprice=20+priceProd(h,w,count);
		return totalprice;
	}
	public int discountInNumber(int x,int price) {
		
		if(x>=6) {
			int z=x-1;
		}
		
		return x;
		
	}
	public int discountInPrice10(int price,int dis) {
		 if(price>600)
			 dis=10;
		int s=price;
		s=(price*dis)/100;
		s=price-s;
		return s;
	}
	public static void main(String[] args) {
		Bill h=new Bill();
		for(int i=0;i<10;i++) {
			//System.out.println(h.priceProd("ss"));
		}
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return totalprice;
	}
	
}
