package myPackage;

import java.util.List;

public class OrderDistributor {
    private List<Worker> workers;
    
    int ay;
    public OrderDistributor(List<Worker> workerss) {
        this.workers = workerss;
        
    }

    public void distributeOrders(List<ProductMain> orders) {
        int totalOrders = orders.size();
        int numWorkers = workers.size();
        int avg = totalOrders / numWorkers;

        int currentWorkerIndex = 0;
        int ordersAssigned = 0;
     
        	
      
            ordersAssigned++;
            if (ordersAssigned % avg == 0) {
                currentWorkerIndex++;
          
            if (currentWorkerIndex == numWorkers) {
                
            }
        }
    }
}