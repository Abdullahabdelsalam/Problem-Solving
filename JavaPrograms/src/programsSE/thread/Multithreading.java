package programsSE.thread;

public class Multithreading extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }

    public static void main(String args[]){
        Multithreading t1=new Multithreading();
        t1.start();
    }
}
