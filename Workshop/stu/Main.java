import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main{
   public static void main (String[] args){
        List<Student> list = new ArrayList<>();
        Student s1 = new Student(55, "istuti", 1234);
        Student s2 = new Student(87, "divya", 4567);
        Student s3 = new Student(13, "naitik", 6789);
        Student s4 = new Student(33, "xyz", 6789);
        Student s5 = new Student(8, "pqr", 789);
        List<Student> list1 = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
       list.add(s5);
       List<Student> eligible= list.stream()
               .filter(s-> s.getAge()>20)
               .collect(Collectors.toList());
//       List<Student> e= list.stream()
//               .filter(s-> s.getAge()>20)
//               .map(s-> setage())
//        System.out.println(eligible);

    }
}
