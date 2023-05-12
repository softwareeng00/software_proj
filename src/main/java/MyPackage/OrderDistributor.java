package mypackage;

import java.util.List;

public class OrderDistributor {
    private List<Worker> workers;
    
    int ay;
    public OrderDistributor(List<Worker> workerss) {
        this.workers = workerss;
        
    }

    
    public int distributeOrders(List<ProductMain> orders) {
        int totalOrders = orders.size();
        int numWorkers = workers.size();
        int avg = totalOrders / numWorkers;

        return avg;
    }
}