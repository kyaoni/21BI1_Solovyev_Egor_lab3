import java.util.regex.*;
import java.util.Scanner;
public class lab3 {
    public static void main(String args[]) {
        String pattern = "(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[012])/(19|[2-9][0-9])\\d\\d";
        Pattern p = Pattern.compile(pattern);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату");
        String text = scanner.next();
        scanner.close();
        Matcher m = p.matcher(text);
        if (m.matches() == true) {
            System.out.println("Дата удовлетворяет формату dd/mm/yyyy и допустимому диапазону");
        }
        else {
            System.out.println("Дата не удовлетворяет формату dd/mm/yyyy или допустимому диапазону");
        }
    }
}