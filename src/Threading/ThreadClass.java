package Threading;

public class ThreadClass extends Thread{
    public void run()
    {
        System.out.println("thread chal rha h");
    }

    static void main(String[] args) {
        ThreadClass t=new ThreadClass();
        t.start();
    }
}
