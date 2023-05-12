package MyPackage;

public class Bill {
	int ay;
	 int price;
	 int totalprice;
	 int countofprodforcustomer;
	 int pricefordelivery;
	
	public Bill() {
		price=300;
		countofprodforcustomer=2;
		pricefordelivery=20;
	}
	public int priceProd(int h,int count) {
		 
		
		
		return 50*h*count;
	}
	public int totalPriceofproduct(int h,int w,int count) {
		 
		totalprice=20+priceProd(h,count);
		return totalprice;
	}
	public int discountInNumber(int x) {
		
		if(x>=6) {
			x--;
		}
		
		
		
		return x;
		
	}
	public int discountInPrice10(int price,int dis) {
		 if(price>600)
			 dis=10;
		
		int s=(price*dis)/100;
		s=price-s;
		return s;
	}
	
	public double getPrice() {
	
		return price;
	}
	public double getTotalPrice() {
		
		return totalprice;
	}
	
}
