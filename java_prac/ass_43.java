class PriorityThread extends Thread{
    private long Count=0;
    public PriorityThread(String name){
        super(name);
    }
    @Override
    public void run(){
        While(true){
            cnt++;
        }
    }
}
public class ass_43{
    public static void main(String args[]){
         PriorityThread lowPriorityThread = new PriorityThread("Low Priority Thread");
        PriorityThread highPriorityThread = new PriorityThread("High Priority Thread");

        // Set priorities
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);
        highPriorityThread.setPriority(Thread.MAX_PRIORITY);

        // Start the threads
        lowPriorityThread.start();
        highPriorityThread.start();

        // Let the threads run for a while
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Stop the threads
        lowPriorityThread.interrupt();
        highPriorityThread.interrupt();

        // Print the counts
        System.out.println(lowPriorityThread.getName() + " count: " + lowPriorityThread.count);
        System.out.println(highPriorityThread.getName() + " count: " + highPriorityThread.count);
    }