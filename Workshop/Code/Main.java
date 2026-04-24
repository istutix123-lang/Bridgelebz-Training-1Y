//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
public static void main(String[] args){
    interface Calculator {
        int calculate(int a, int b);
    }

    public class XYZ {

        static void compute(int a, int b, Calculator c) {
            System.out.println("Result: " + c.calculate(a, b));
        }

        public static void main(String[] args) {

            Calculator sum = (int a, int b ) -> a + b); // Sum
            Calculator sub = (int a, int b ) -> a - b); // Sub
            Calculator product= (int a, int b ) -> a * b); // Product
            Calculator div = (int a, int b )  -> a / b); // Division
        }
    }
}