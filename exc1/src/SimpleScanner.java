import java.util.Scanner;

public class SimpleScanner {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int i=scanner.nextInt();
        float f=scanner.nextFloat();
        String str=scanner.next();//Считывает с клавы до пробела

        Scanner scanner2 =new Scanner(System.in);
        String str2=scanner2.nextLine();//Считывает с клавы всю строку

        System.out.println("Number="+i+" Float="+f+" "+"Word="+str+" Line="+str2 );
    }
}
