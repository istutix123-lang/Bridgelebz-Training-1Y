import a.MyThread;
public class Main {
    public static void main(String[] args) {


        System.out.println("main starts");
        MyThread mt = new MyThread(Thread.MAX_PRIORITY);
        mt.setPriority(MyThread.MAX_PRIORITY);
        OtherThread ot = new OtherThread();
        Thread tt=new Thread(new ThirdThread());
        mt.start();
        ot.start();
        tt.start();
        StringBuffer sb1 = new StringBuffer("ABC");
        sb1.append(str);
        System.out.println("main ends");
    }
}