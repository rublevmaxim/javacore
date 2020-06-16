import java.util.Scanner;

public class ConsoleReader {
    static Scanner scanner = new Scanner(System.in);

    public static String readString(){
        System.out.println ("Введите строку:" );
        return scanner.nextLine();
    }// – читает с клавиатуры строку
    public static int readInt(){
        System.out.println ("Введите целое число:" );
        return scanner.nextInt();
    }// – читает с клавиатуры число
    public static double readDouble(){
        System.out.println ("Введите дробное число:" );
        return scanner.nextDouble ();
    }// – читает с клавиатуры дробное число
    public static boolean readBoolean(){
        System.out.println ("Введите true/false:" );
        return scanner.nextBoolean ();
    }// – читает с клавиатуры строку "true" или "false" и возвращает
    public static String multiply(int count){
        String str =readString ();
        if (count>0) for (int i = 0; i < count - 1; i++) {
            str = str + str;
        }
        return str;
    } //– возвращает строку, повторенную count раз.
}
