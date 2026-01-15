public class VolumeOfEarth{
    public static void main (String[] args){
       double r= 6378;
       double pi=3.14;
       double volume=(4.0/3.0)*pi*r*r*r;
       
       double  miles= volume*1.6*1.6*1.6;
       
        System.out.print("The volume of earth in cubic kilometers is " + volume+ " and cubic miles is " + miles     );
    }
}