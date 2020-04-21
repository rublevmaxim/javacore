import java.util.Scanner;
//Уировень 3 задание 8
public class exec1 {
public static void main(String[] args){
    int i,s=0;
    String s1="";
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for (i=1;i<n;i++){
        s=s+i;
        if (i>1)
        {
            s1=s1+"+"+i;
        }
        else
        {
            s1=""+i;
        }
        System.out.println(s1+"="+s);
    }
}
}

