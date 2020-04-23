import java.util.Scanner;

public class exec1 {
    public static void main(String[] args) {
        //exc1();
        //exc2();
        //exc3();

    }

    /*
    Задание 1 Сумма n чисел
    Вывести на экран сумму чисел от 1 до 10 построчно:
    */
    private static void exc1() {
        int i, s = 0;
        String s1 = "";
        System.out.println("input n=10");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (i = 1; i < n; i++) {
            s = s + i;
            if (i > 1) {
                s1 = s1 + "+" + i;
            } else {
                s1 = "" + i;
            }
            System.out.println(s1 + "=" + s);
        }
    }

    /*
   Задание 2 Мама мыла раму
    Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
   */
    private static void exc2() {
        String[] s = {"Мама", "Мыла", "Раму","Папа"};
        //String[] s = {"1", "2", "3"} ;

        int i, j;
        for (i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            for (j = 0; j < s.length; j++) {
                if (j != i) {
                    System.out.print(s[j]);
                }
            }
            System.out.println("");

            System.out.print(s[i]);
            for (j = 0; j < s.length; j++) {
                if (s.length - j - 1 != i) {
                    System.out.print(s[s.length - j - 1]);
                }
            }
            System.out.println("");
        }

    }

    /* Задание 3
    Выведи на экран таблицу умножения 10 на 10 в следующем виде:
    1 2 3 …
    2 4 6 …
    3 6 9 …        */
    private static void exc3() {
        int i, j;

        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println("");
        }

    }
    /* Задание 4
   Семь цветов радуги
    Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
    Каждый объект при создании выводит на экран определенный цвет.
           */
    private static void exc4() {

        Color red=new Color("Red");

    }

}