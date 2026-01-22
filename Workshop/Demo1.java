public class Demo3{
    static int x = 10;
    int y = 20;
    void m1(){
        System.out.println(x);
        System.out.println(y);
    }
    static void m2(){
        System.out.println(x);
        Demo3 obj = new Demo3();
        System.out.println(obj.y);
    }
    public static void main(String[] args){
        System.out.println(x);
        Demo3 obj1 = new Demo3();
        System.out.println(obj1.y);
        obj1.y=50;
        obj1.m1();
        Demo3 obj2 = new Demo3();
        obj2.m1();
        m2();
	System.out.println(args[0]);
    }
}