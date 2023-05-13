package mypackage;


public class OrderDistributor {
     String workers;
    

    public OrderDistributor() {
        this.workers = "ahmed";
        
    }

   

	public int distributeOrders(String aorders) {
        int totalOrders = 200;
        int numWorkers = 12;
        int avg = totalOrders / numWorkers;

        int currentWorkerIndex=0;
        int ordersAssigned = 0;
     
   
            ordersAssigned++;
            return (ordersAssigned % avg == 0) ? currentWorkerIndex++:currentWorkerIndex;
           
        }
	
    }
