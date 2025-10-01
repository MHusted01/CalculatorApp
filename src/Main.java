//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    public static boolean validNumber(String number) {
        try {
           double numberDouble = Double.parseDouble(number);
           return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}