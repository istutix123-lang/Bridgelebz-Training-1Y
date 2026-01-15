public class DistributionOfPens{
    public static void main (String[] args){
       int pens=14;
       int students=3;
       int remainingpens= pens % students;
        int distributedpens=pens/students;
        System.out.print("The pen per student is = " + distributedpens + " and the remaining pens not distributed is  " + remainingpens   );
    }
}