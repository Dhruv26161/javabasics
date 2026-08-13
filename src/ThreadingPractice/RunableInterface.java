package ThreadingPractice;

import Threading.Runnableinterface;

import java.lang.Thread;

public class RunableInterface implements Runnable{
    @Override
    public void run() {
        System.out.println("Running thread");
    }

    static void main(String[] args) {
        Thread thh= new Thread(new RunableInterface());
        thh.start();
    }
}
