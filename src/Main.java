import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        String uli ;
        final int NUM = 12;
        String word = "Arzu";
        uli = NUM  +  word;
        System.out.println(uli);
        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");

        } else {
            System.out.println("Вы сохранили ноль");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = sc.nextLine();
        System.out.println("Привет " + name);

    }
}





