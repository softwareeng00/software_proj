package mypackage;


public class OrderDistributor {
     String workers;
    

    public OrderDistributor() {
        this.workers = "ahmed";
        
    }

   

	public int distributeOrders() {
        int totalOrders = 200;
        int numWorkers = 12;
        int avg = totalOrders / numWorkers;

        int currentWorkerIndex=0;
        int ordersAssigned = 0;
     
   
            ordersAssigned++;
            if (ordersAssigned % avg == 0) {
                currentWorkerIndex++;
            }
            return currentWorkerIndex;
           
        }
	
    }