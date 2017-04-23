package thread5;
class UsingRunnable implements Runnable{
    private Thread th;
    private String threadName;
    UsingRunnable(String name){
        threadName = name;
        System.out.println("a new thread has been created:" + threadName);
    }
    public void run(){
        System.out.println("Using thread: " + threadName);
        try{
            for(int i=5;i>0;i--){
                System.out.println("Thread"+ threadName+","+i);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println("thread "+ threadName+" crashed");
        }
        System.out.println("thread"+ threadName+ " exits");
    }
    public void start(){
        System.out.println("Starting "+threadName);
        if(th==null){
            th=new Thread(this, threadName);
            th.start();
        }
    }
}
public class Thread5 {
    public static void main(String[] args) {
        UsingRunnable ob= new UsingRunnable("First thread" );
        ob.start();
        UsingRunnable ob2=new UsingRunnable("Second thread");
        ob2.start();
    }
}
