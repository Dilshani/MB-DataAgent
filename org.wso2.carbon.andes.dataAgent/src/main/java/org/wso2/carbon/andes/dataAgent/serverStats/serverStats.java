package  org.wso2.carbon.andes.dataAgent.serverStats;

public  class serverStats{


    private  int availableProcessors; 	/* Total number of processors or cores available to the JVM */
    private  long freeMemory;  /* Total amount of free memory available to the JVM */
    private long totalMemory; /* Total memory currently available to the JVM */

    public int getAvailableProcessors() {
        return availableProcessors;
    }

    public void setAvailableProcessors() {
       availableProcessors =  Runtime.getRuntime().availableProcessors();
    }

    public long getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory() {
       freeMemory =  Runtime.getRuntime().freeMemory();
    }

    public long getTotalMemory() {
        return totalMemory;
    }

    public void setTotalMemory() {
        totalMemory = Runtime.getRuntime().totalMemory();
    }
}