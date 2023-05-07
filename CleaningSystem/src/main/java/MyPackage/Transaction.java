package MyPackage;
import java.util.List;

public class Transaction {
	int ay;
	Bill b=new Bill();
	ProductMain p=new ProductMain();
    
    private String itemId;//
    private double price;//
    private double cashPaid;//
    private double debtPaid;
    
    public Transaction()
    {
    	this.price=b.getPrice();
    	this.itemId=p.getID();
    	this.cashPaid=b.getTotalPrice();
    	//dept??
    	this.debtPaid=b.getTotalPrice();//check
    	
    }
    
    
    public String getItemId() {
        return itemId;
    }
    
    public double getPrice() {
        return price;
    }
    
    public double getCashPaid() {
        return cashPaid;
    }
    
    public double getDebtPaid() {
        return debtPaid;
    }
}

 class StatisticsGenerator {
    private List<Transaction> transactions;
    
    public StatisticsGenerator(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public int getTotalDeliveredItems() {
        return transactions.size();
    }
    
    public double getTotalCash() {
        double totalCash = 0.0;
       /* for(int i =0;i<=transactions.size() ;i++)
        {
        	Transaction transaction = null;
        	totalCash += transaction.getCashPaid();
        }*/
        for (Transaction transaction : transactions) {
            totalCash += transaction.getCashPaid();
        }
        return totalCash;
    }
    
    public double getTotalPaid() {
        double totalPaid = 0.0;
        for (Transaction transaction : transactions) {
        	
            totalPaid += transaction.getCashPaid() + transaction.getDebtPaid();
        }
        return totalPaid;
    }
    
    public double getTotalDebts() {
        double totalDebts = 0.0;
        for (Transaction transaction : transactions) {
            totalDebts += transaction.getDebtPaid();
        }
        return totalDebts;
    }
}
