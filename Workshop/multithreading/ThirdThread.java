public class ThirdThread implements Runnable{
    @Override
    public void run(){
        for (int i=20;i>10;i--){
            System.out.println(i);

//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }

        }

    }
}
