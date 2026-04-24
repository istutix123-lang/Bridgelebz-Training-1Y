import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String regex  ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&*!?])[A-Za-z\\d@$!%*?&]{8,16}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("ABCDfjhj@34");
        if (matcher.matches()){
            System.out.println("Valid String");
        } else {
            System.out.println("Invalid String");
        }
    }
}