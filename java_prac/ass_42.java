class AdderThread extends Thread {
    private int start;
    private int end;
    private int result;

    public AdderThread(int start,int end){
        this.start=start;
        this.end=end;
    }
    public int getresult(){
        return result;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            result += i;
        }
    }
}

public class ass_42{
    public static void main(String args[]){
        int mid =(1+1000)/2;
        AdderThread thread1= new AdderThread(1,mid);
        AdderThread thread2=new AdderThread(mid+1,1000);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
            int result=thread1.getresult()+thread2.getresult();
            System.out.println("result is "+result);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}