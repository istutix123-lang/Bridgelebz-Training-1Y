

        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

        public class X{
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
            String regex="\\d";
//                System.out.print("Enter string: ");
//                String str = sc.nextLine();
                Pattern pattern= Pattern.compile(regex);
                Matcher matcher= pattern.matcher("1abABZ");
                if (matcher.matches()){
                    System.out.println("Valid String");
                } else {
                    System.out.println("Invalid String");
                }
            }
        }