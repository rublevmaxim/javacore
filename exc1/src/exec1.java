import maxsoft.level5.Bun;
import maxsoft.level5.Cat;
import maxsoft.level5.Cat.*;
import maxsoft.level5.String_m;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.util.*;
import java.util.stream.Collectors;

public class exec1 {
    public static void main ( String[] args ) {
        exc23 ();
   }


    /*
    Задание 1 Сумма n чисел
    Вывести на экран сумму чисел от 1 до 10 построчно:
    */
    private static void exc1 () {
        int i, s = 0;
        String s1 = "";
        System.out.println ("input n=10");
        Scanner scanner = new Scanner (System.in);
        int n = scanner.nextInt ( );

        for (i = 1; i < n; i++) {
            s = s + i;
            if (i > 1) {
                s1 = s1 + "+" + i;
            } else {
                s1 = "" + i;
            }
            System.out.println (s1 + "=" + s);
        }
    }

    /*
   Задание 2 Мама мыла раму
    Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
   */
    private static void exc2 () {
        String[] s;
        s = new String[]{"Мама", "Мыла", "Раму", "Папа"};
        //String[] s = {"1", "2", "3"} ;

        int i, j;
        for (i = 0; i < s.length; i++) {
            System.out.print (s[i]);
            for (j = 0; j < s.length; j++) {
                if (j != i) {
                    System.out.print (s[j]);
                }
            }
            System.out.println ("");

            System.out.print (s[i]);
            for (j = 0; j < s.length; j++) {
                if (s.length - j - 1 != i) {
                    System.out.print (s[s.length - j - 1]);
                }
            }
            System.out.println ("");
        }

    }

    /* Задание 3
    Выведи на экран таблицу умножения 10 на 10 в следующем виде:
    1 2 3 …
    2 4 6 …
    3 6 9 …        */
    private static void exc3 () {
        int i, j;

        for (i = 1; i < 11; i++) {
            for (j = 1; j < 11; j++) {
                System.out.print (i * j + " ");
            }
            System.out.println ("");
        }

    }

    /* Задание 4
   Семь цветов радуги
    Создать 7 объектов, чтобы на экран вывелись 7 цветов радуги (ROYGBIV).
    Каждый объект при создании выводит на экран определенный цвет.
           */
    private static void exc4 () {
        Color R = new Color ("R");
        Color O = new Color ("O");
        Color Y = new Color ("Y");
        Color G = new Color ("G");
        Color B = new Color ("B");
        Color I = new Color ("I");
        Color V = new Color ("V");
        System.out.println ("日本語 ");
    }

    /* Задание 5

Про экранирование символов в Java читайте в дополнительном материале к лекции. Вывести на экран следующий текст - две строки:
It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"
It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"
Подсказка:
    \t  — Символ табуляции (в java – эквивалент четырех пробелов);
\b — Символ возврата в тексте на один шаг назад или удаление одного символа в строке (backspace);
\n — Символ перехода на новую строку;
\r — Символ возврата каретки;
\f— Прогон страницы к началу следующей страницы;
\’ — Символ одинарной кавычки;
\” — Символ двойной кавычки;
\\ — Символ обратной косой черты (\).
     */

    private static void exc5 () {
        //String dk="\”";
        // System.out.println("\"");
        System.out.println ("It's Windows path: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
        System.out.println ("\"\\C:\\Program Files\\Java\\jdk1.7.0\\bin\"");
    }

    /*
    Ввести с клавиатуры число и имя, вывести на экран строку:
    «имя» захватит мир через «число» лет. Му-ха-ха!
    */
    private static void exc6 () {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine ( );
        int age = scanner.nextInt ( );
        System.out.println (name + " захватит мир через " + age + " лет. Му-ха-ха!");
    }

    /*
   Ввести с клавиатуры отдельно Имя, число1, число2. Вывести надпись: «Имя» получает «число1» через «число2» лет.
    */
    private static void exc7 () {
        Scanner scanner = new Scanner (System.in);
        String name = scanner.nextLine ( );
        long num1 = scanner.nextInt ( );
        int num2 = scanner.nextInt ( );

        System.out.println (name + " получит " + num1 + " через " + num2 + " лет");
    }
    /*Уровень 5*/
/*
Реализовать метод fight

Реализовать метод boolean fight(Cat anotherCat): реализовать механизм драки котов в зависимости от их веса, возраста и силы. Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет, т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) == true , то cat2.fight(cat1) == false
 */

    private static void exc8 ( Integer o1 ) {
        o1 = 10;
        Cat barsic = new Cat ( );
        barsic.setName ("barsic");
        barsic.setAge (2.0);
        barsic.setStrength (2);
        barsic.setWeight (2.0);

        Cat mursic = new Cat ( );
        mursic.setName ("mursic");
        mursic.setAge (1.0);
        mursic.setStrength (1);
        mursic.setWeight (1.0);

        Cat pushok = new Cat ( );
        pushok.setName ("pushok");
        pushok.setAge (5.0);
        pushok.setStrength (1);
        pushok.setWeight (2.0);

        Cat noname = new Cat ( );
        //noname.initialize ();
        System.out.println (noname.getName ( ));
        noname.setName ("pisun");
        System.out.println (noname.getName ( ));

        Cat noname1 = new Cat ( );
        System.out.println (noname1.getName ( ));

        Cat noname2 = new Cat (51);
        System.out.println (noname2.getName ( ));

        System.out.println (barsic.fight (mursic));
        System.out.println (barsic.fight (pushok));
        System.out.println (pushok.fight (mursic));
        Cat.Cat1 kisa = new Cat.Cat1 ( );
        Person.Man man = new Person.Man ( );
        man.toString ( );
        noname = null;
        long i;
        for (i = 0; i < 50; i++) {
            Cat pushok1 = new Cat ( );
        }
        System.out.println ("Количество катов " + pushok.getcatcount ( ));
        System.out.println ("Расстояние между катов " + Cat.cat_distance (1.2, 3, 4, 5.5));
/*
    String str_key= ConsoleReader.readString ( );
    System.out.println ("Str:"+str_key);



    Double dbl_key= ConsoleReader.readDouble ( );
    System.out.println ("Dbl:"+dbl_key);

    Boolean bool_key= ConsoleReader.readBoolean ( );
    System.out.println ("Bool:"+bool_key);

    int int_key=ConsoleReader.readInt ();
    System.out.println ("Int:"+int_key );*/
        System.out.println (ConsoleReader.multiply (3));


    }
    /*


     */

    private static void exc9 () {
        int[] arr = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
        int min;
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println ("Min=" + min);
        String[] arr1 = new String[10];
        for (int i = 0; i < arr1.length; i++) {
            //1arr1[i]=ConsoleReader.readString();
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println (arr1[arr1.length - i - 1]);
        }

        ArrayList<String> arr2 = new ArrayList<String> ( );
        int i = 0;
        for (i = 0; i < 5; i++) {
            arr2.add (ConsoleReader.readString ( ));
        }
        i = 0;
        for (String arr2_it : arr2) {
            System.out.println (i + arr2_it);
            i++;
        }
        String s = arr2.get (arr2.size ( ) - 1);
        System.out.println (arr2.get (arr2.size ( ) - 1));
        arr2.remove (arr2.size ( ) - 1);
        arr2.add (0, s);
        i = 0;
        for (String arr2_it : arr2) {
            System.out.println (i + arr2_it);
            i++;
        }
    }

    //Колекции Set, List, Map
    private static void exc10 () {
        Set<String> set = new HashSet<String> ( );
        set.add ("Mama");
        set.add ("Mila");
        set.add ("Ramu");

        //получение итератора для множества
        Iterator<String> iterator = set.iterator ( );

        while (iterator.hasNext ( ))        //проверка, есть ли ещё элементы
        {
            //получение текущего элемента и переход на следующий
            String text = iterator.next ( );

            // System.out.println(text);
        }
        Collection<Integer> list = new ArrayList<> ( );
        list.add (1);
        list.add (2);
        list.add (3);
        list.add (1);

        // System.out.println (list.add(1));
        //System.out.println (list.size() );
        Cat mursic = new Cat ( );
        mursic.setName ("mursic");
        mursic.setAge (10.0);
        mursic.setWeight (5.0);
        mursic.setStrength (7);

        Cat dimok = new Cat ( );
        dimok.setName ("dimok");
        dimok.setAge (11.0);
        dimok.setWeight (9.0);
        dimok.setStrength (8);

        Cat zvezdochka = new Cat ( );
        zvezdochka.setName ("zvezdochka");
        zvezdochka.setAge (11.0);
        zvezdochka.setWeight (7.0);
        zvezdochka.setStrength (10);

        Map<String, Cat> map = new HashMap<String, Cat> ( );
        map.put (mursic.getName ( ), mursic);
        map.put (dimok.getName ( ), dimok);
        map.put (zvezdochka.getName ( ), zvezdochka);

        Iterator<Map.Entry<String, Cat>> iterator1 = map.entrySet ( ).iterator ( );

        while (iterator1.hasNext ( )) {
            //получение «пары» элементов
            Map.Entry<String, Cat> pair = iterator1.next ( );
            String key = pair.getKey ( );            //ключ
            Cat value = pair.getValue ( );        //значение
            // System.out.println(key + ":{ name - " +
            //                            value.getName ()+";"+
            //                           value.Age ()+";"
            //      );
            System.out.println (key + ":" + value.toString ( ));
        }
        Cat value = map.get ("zvezdochka");
        System.out.println (value.toString ( ));
    }

    //Работа с датами
    private static void exc11 () throws InterruptedException {
        Date date1 = new Date ( );
        System.out.println (date1);
        Thread.sleep (3000);
        Date date2 = new Date();
        long interval = date2.getTime ( ) - date1.getTime ( );
        System.out.println (interval);
    }

    //Работа со списками
    private static void exc12(){
        Cat zvezdochka = new Cat ( );
        zvezdochka.setName ("zvezdochka");
        zvezdochka.setAge (11.0);
        zvezdochka.setWeight (7.0);
        zvezdochka.setStrength (10);

        Cat mursic = new Cat ( );
        mursic.setName ("mursic");
        mursic.setAge (10.0);
        mursic.setWeight (5.0);
        mursic.setStrength (7);

        Cat dimok = new Cat ( );
        dimok.setName ("dimok");
        dimok.setAge (11.0);
        dimok.setWeight (9.0);
        dimok.setStrength (8);

        Cat[] cats={zvezdochka,mursic,dimok};
        int i=1;
        for(Cat tmp:cats){
            System.out.println (tmp.getName ()+" "+tmp.getAge () );
            tmp.setName ("pisun"+i);
            tmp.setAge (100+i);
            i++;
        }

        for(Cat tmp:cats){
            System.out.println (tmp.getName ()+" "+tmp.getAge () );
        }

        Collection<Cat> list1= new ArrayList<> ();
        list1.add (mursic);
        list1.add (zvezdochka);
        list1.add (dimok);

        Iterator<Cat> iterator = list1.iterator ();

        while (iterator.hasNext ()){
            Cat tmp = iterator.next ();
            System.out.println (tmp.getName ()+" "+tmp.getAge () );
        }


       /*
        Collection<Integer> list1= new ArrayList<> ();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        Collection<Integer> list2=new ArrayList<>();
        list2.addAll(list1);
        System.out.println (list2+" "+list2.size() );

        Object[] arr=list2.toArray();

        for (int i=0;i<arr.length; i++){
            System.out.println ( arr[i]);
        }
        System.out.println (arr.length );
    }*/
    }


    // Работа с HashMap
    private static void exc13(){
        Map<String,Integer> map_sd=new HashMap<> ();
        map_sd.put ("World",100);
        map_sd.put ("World", 150);
        map_sd.put (null,100);
        map_sd.put (null,150);

        map_sd.put ("World1",100);
        map_sd.put ("World2",100);
        for (Map.Entry<String, Integer> tmp: map_sd.entrySet ())
        {
            System.out.println (tmp.getKey ()+" "+tmp.getValue ());
        }
    }


    //Сортировка массива
    private static void exc14(){
        int[] arr={4,5,2,1,5,6,9};
        String[] students={"Alex","Andrew","Yevhenii"};
        Arrays.sort(arr);
        Arrays.sort(students);

        for (int tmp:arr) {
            System.out.println (tmp);
        }
        for (String tmp:students) {
            System.out.println (tmp);
        }
        Cat zvezdochka = new Cat ( );
        zvezdochka.setName ("zvezdochka");
        zvezdochka.setAge (11.0);
        zvezdochka.setWeight (7.0);
        zvezdochka.setStrength (10);

        Cat mursic = new Cat ( );
        mursic.setName ("mursic");
        mursic.setAge (10.0);
        mursic.setWeight (5.0);
        mursic.setStrength (7);

        Cat dimok = new Cat ( );
        dimok.setName ("dimok");
        dimok.setAge (11.0);
        dimok.setWeight (9.0);
        dimok.setStrength (8);

        Cat[] cats={zvezdochka,mursic,dimok};
        Cat[] cats1={zvezdochka,mursic,dimok};
        System.out.println ("Array1:" );
        for(Cat tmp:cats)
        {
            System.out.println (tmp.toString ());
        }
        System.out.println (cats.toString ());
        Arrays.sort(cats);
        System.out.println ("Sorted array1" );
        for(Cat tmp:cats)
        {
            System.out.println (tmp.toString ());
        }

        System.out.println ("Array2:" );
        for(Cat tmp:cats)
        {
            System.out.println (tmp.toString ());
        }
        System.out.println (cats.toString ());

        //Сортировка с помощью ананонимных классов
        Arrays.sort(cats, new Comparator<Cat> ( ) {
            public int compare ( Cat o1, Cat o2 ) {
                return ((Cat) o1).getStrength ()-((Cat) o2).getStrength ();
            }
        });


        System.out.println ("Sorted array1" );
        for(Cat tmp:cats)
        {
            System.out.println (tmp.toString ());
        }


    }
    //Работа со строками. Наибольшая общая последовательность
    private static void exc15(){
        String s1="MABCAB";
        String s2="YABCAB";


        String_m eq=new String_m();
        System.out.println ( eq.len_sequence (s1,s2));
        System.out.println (eq.s3);
    }



    //Двоичная куча
    private static void exc16(){
        int[] data= {10,45,346,56,345,645,2336,5633,345};
        //Bun.swap_bun(m,0,1);
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+";");
        }


        Bun.heap_sort(data);
        System.out.println("");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+";");
        }

    }
    //Quick sort
    private static void exc17(){
        int[] data= {10,45,346,56,345,645,2336,5633,345};
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+";");
        }
        Bunch.quick_sort (data,0,data.length);
        System.out.println("");
        for(int i=0;i<data.length;i++){
            System.out.print(data[i]+";");
        }
    }

    //Работа с потоками ввода - вывода
    private static void exc18() {

        //exc18.1 Файл не найден
        try {
            InputStream inputStream= new FileInputStream("\12.txt");
            System.out.println("OK");
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
            e.printStackTrace();
        }

        //exc18.2 Вывод массива побайтно
        byte[] arr=new byte[]{1,3,5,7};
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(arr);

        int tmp;

        while ((tmp=byteArrayInputStream.read())!=-1){
            System.out.println(tmp);
        }

        //exc18.2 Вывод диапазона байт строки
        String str="Hello";
        byte[] arr2=str.getBytes();
        ByteArrayInputStream byteArrayInputStream1=new ByteArrayInputStream(arr2,1,2);

        int tmp1;

        while ((tmp1=byteArrayInputStream1.read())!=-1){
            System.out.println((char)tmp1);
        }




    }

    //Работа с файлами 1
    private static void exc19() {
      try(PrintWriter pw=new PrintWriter(new OutputStreamWriter(System.out,"UTF-8"),true) ){
          File f=new File("/home/max-work/IdeaProjects/javacore/exc1/src/exec1.java");
          pw.println();
          pw.println("Файл "+f.getName()+";"+(f.exists() ? "" : "не ")+"существует");
          pw.println("Вы "+(f.canRead() ? "": "не ") + "может читать файл");
          pw.println("Вы "+(f.canWrite() ? "": "не ") + "может записывать в файл");
          pw.println("Длинна файла "+f.length()+" б");
          pw.println();

          File d = new File("/home/max-work/IdeaProjects/javacore/exc1/src");

          pw.println("Содержимое каталога:");

          if (d.exists() && d.isDirectory()){
              String[] s=d.list();
              for(int i=0;i<s.length;i++){
                  pw.println(s[i]);
              }
          }



      } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
      }

    }
    //Работа с файлами 2. Сравнение BufferedInputStream(читает из файла данные заданными блоками)
    //и FileInputStream(читает данные из файла по 1 байту)
    private static void exc20()  {
        Date date = new Date();
        Date date1 = new Date();

        try(FileOutputStream fileOutputStream = new FileOutputStream("test.txt", true);) {
            //Наполняем файл
            FileInputStream fileInputStream = new FileInputStream("test.txt");
            String greetings = "Привет! Добро пожаловать на JavaRush - лучший сайт для тех, кто хочет стать программистом!\r\n";
            String greetings1="";
            for (int i=1;i<200;i++) {
                greetings1=i+greetings;
                fileOutputStream.write(greetings1.getBytes());
            }

            //Считываем файл с помощью fileInputStream
            date=new Date();

            int i;

            if (fileInputStream.markSupported()) fileInputStream.mark(0);//Возврат в начало файла


            while((i = fileInputStream.read())!= -1){

                // System.out.print((char)i);
            }
            fileInputStream.close();

            fileInputStream = new FileInputStream("test.txt");

            date1 = new Date();

            System.out.println("time fileInputStream:"+(date1.getTime() - date.getTime()));

            //Считываем файл с помощью BufferedInputStream
            date=new Date();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

           while((i = bufferedInputStream.read())!= -1){

                //System.out.print((char)i);
            }

            //Считываем Поток через сканер и выводим построчно
            //Scanner s = new Scanner(bufferedInputStream).useDelimiter("\\A");
            //String result = s.hasNext() ? s.next() : "";
            //System.out.println(result);

            //Считываем Поток через Collectors и выводим построчно
            //String result1 = new BufferedReader(new InputStreamReader(bufferedInputStream))
             //       .lines().collect(Collectors.joining("\n"));

            //System.out.println(result1);



            date1 = new Date();

            System.out.println("time bufferedInputStream:"+(date1.getTime() - date.getTime()));



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Работа с system.in => Поток выдаёт Byte
    private static void exc21() {
        int i= 0;
       /* try {
            i = System.in.read();
            System.out.println(i);//Выведится Ascii code 1-го символа ввода
            System.out.println((char)i);//Выведится 1-й символа ввода
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        /*int i2 = 0;
        try(InputStreamReader inputStreamReader =new InputStreamReader(System.in);) {
            i2 = inputStreamReader.read();
            System.out.println(i2);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader принимает на вход Reader и выполняет буферизацию(размер буфера 8192)
        //InputStreamReader принимает на вход поток ввода in

        BufferedInputStream br1=new BufferedInputStream(System.in);
        try {
            //int i3=br.read();
            //String i4=br.readLine();
            int i5=Integer.parseInt(br.readLine());
            //System.out.println(i3);
            System.out.println(i5);

        } catch (IOException e) {
            e.printStackTrace();
        }

        // DataInputStream, DataOutputStream Позволяют читать/записывать в файл типизированные наборы данных
        //try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream((new FileOutputStream("data_j.txt"))));
         //   DataInputStream in =new DataInputStream(new BufferedInputStream((new FileInputStream("data_j.txt")))); ) {
        try(DataOutputStream out = new DataOutputStream((new FileOutputStream("data_j.txt")));
                DataInputStream in =new DataInputStream((new FileInputStream("data_j.txt"))); ) {
            out.writeShort(100);
            out.writeInt(1000);
            out.writeLong(10L);
            out.writeUTF("Hello World!!!");
            out.flush();


            System.out.println("Short "+in.readShort());
            System.out.println("Int "+in.readInt());
            System.out.println("Long "+in.readLong());
            System.out.println("UTF "+in.readUTF());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //FileReader, FileWriter,BufferdReader, RandomAccessFile
    private static void exc22() {
        File f1= new File("data_j.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(f1))) {
            String temp;
            while ((temp=br.readLine())!=null){
                System.out.println(temp);
            }
            br.close();
            PrintWriter pw=new PrintWriter(new FileWriter(f1,true));// Если append=false то перезапись
            pw.println("Good Luck");
            pw.flush();
            pw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        RandomAccessFile raf =null;
        try {
            raf = new RandomAccessFile("data_j.txt","rw");
            raf.write(new byte[]{0,1,2,3,4,5,6,7,8,9});
            raf.seek(5);
            raf.write(new byte[]{33,44,55});
            raf.seek(0);
            byte[] arr=new byte[10];
            int n=raf.read(arr,0,10);
            System.out.println(Arrays.toString(arr));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //NIO(nonblocking input, output) работа с файлами и URL
    private static void exc23() {
        /*File sourceFile=new File("data_j.txt");
        File targetFile=new File("data_j");

        try {
            Files.copy(sourceFile.toPath(),targetFile.toPath());
            Files.move(sourceFile.toPath(),targetFile.toPath());

        } catch (IOException e) {
            e.printStackTrace();
        }
*/
        try {
            URL nbuApi=new URL("https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange");
            BufferedReader br=new BufferedReader(new InputStreamReader(nbuApi.openStream()));
            String str;
            while ((str=br.readLine())!=null){
                System.out.println(str);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    }