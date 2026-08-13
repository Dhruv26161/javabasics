package ThreadingPractice;

public class Thread extends java.lang.Thread {
    public void running()
    {
        System.out.println("thread run");
    }

    static void main(String[] args) {
        Thread t=new Thread();
        t.running();
    }
}
