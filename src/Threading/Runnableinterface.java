package Threading;

public class Runnableinterface implements Runnable{
    @Override
    public void run() {
        System.out.println("threading is run");
    }

    static void main(String[] args) {
        Thread th=new Thread(new Runnableinterface());
        th.start();
    }
}
