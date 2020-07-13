import java.io.*;

public class SimpleBufferReader {
    public static void main(String[] args) {

      /*  try (BufferedReader br=new BufferedReader(new InputStreamReader(System.in))) {
            String str=br.readLine();
            int num=Integer.parseInt(br.readLine());
            System.out.println(str);
            System.out.println(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    */
        //System.in=> Bytes
       // int i=System.in.read();
        //System.out.println(i);
        //System.out.println((char)i);

        //InputStreamReader inputStreamReader =new InputStreamReader(System.in);
        //int i2=inputStreamReader.read();
        //System.out.println(i2);
        //System.out.println((char)i2);

        //Запись в файл

        try(DataOutputStream out = new DataOutputStream(new BufferedOutputStream((new FileOutputStream("data_j.txt"))));
            DataInputStream in =new DataInputStream(new BufferedInputStream((new FileInputStream("data_j.txt")))); ) {

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
}
