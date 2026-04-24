public class OtherThread extends Thread{
    @Override
    public void run(){
        for (char i='a';i<'k';i++){
            System.out.println(i);

        }
    }
}
