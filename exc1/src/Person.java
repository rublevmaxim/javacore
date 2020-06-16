import java.io.Serializable;

public class Person implements Serializable {
   private static final long serialVersionUID = 4631818788374330069L;
   public static class Man {
       public void setName ( String name ) {
           this.name = name;
       }

       public void setAge ( int age ) {
           this.age = age;
       }

       public void setAdres ( String adres ) {
           this.adres = adres;
       }

       String name;
       int age;
       String adres;

       public String getName () {
           return name;
       }

       public int getAge () {
           return age;
       }

       public String getAdres () {
           return adres;
       }

       @Override
       public String toString () {
           return "Man{" +
                   "name='" + name + '\'' +
                   ", age=" + age +
                   ", adres='" + adres + '\'' +
                   '}';
       }

   }
    public static class Woman{
       String name;
       int age;
       String adres;
    }
}
