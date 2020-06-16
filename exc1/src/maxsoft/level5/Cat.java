package maxsoft.level5;

import java.util.Comparator;

public class Cat implements Comparable {

    @Override
    public int compareTo ( Object o ) {
        int tmp=this.strength-((Cat)o).strength;
        if (tmp==0){
            return (int)(this.age - ((Cat) o).age);
        }
        else{
            return tmp;
        }
    }

    public static class Cat1{
        int mail;
    }
    public String getName () {
        return name;
    }

    public double getAge () {
        return age;
    }

    public double getWeight () {
        return weight;
    }

    public int getStrength () {
        return strength;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public void setAge ( double age ) {
        this.age = age;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }

    public void setStrength ( int strength ) {
        this.strength = strength;
    }
    //Вызов методов static не требует создание объекта. Например класс Math
    public int getcatcount () {
        return catcount;
    }



    public void setcatcount ( int count ) {
        catcount = count;
    }

    String name;
    double age;
    double weight;
    int strength;
    static int catcount;


//инициализатор
   /* public void initialize()
    {
        this.name = "megapihar";
        this.age=380;
        this.weight=786;
        this.strength=1000;
    }*/
    //конструктор
    //мы уберём конструктор с (), то при создании объекта мы будем обязаны зада начальное значение Age
    public Cat()
    {
        this.name = "megapahar";
        this.age=765;
        this.weight=423;
        this.strength=1000;
        catcount++;
        System.out.println ("Cat add"+catcount);
    }

    public Cat(int age)
    {
        if (age>50){
            System.out.println ("Old pussi");
        }
        this.name = "megapahar";
        this.age=765;
        this.weight=423;
        this.strength=1000;
    }
    @Override
    public String toString()
    {
        return "name="+this.name+";age="+this.age+";weight="+this.weight+";strength="+this.strength+".";
    }

    protected void finalize() throws Throwable {
        catcount--;
        System.out.println ("Cat del"+catcount);
    }

    public static double cat_distance(double x1, double y1, double x2, double y2){
        return  Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
    }
    private double fight_value(){
    return (weight+strength+age);
    }

    public boolean fight(Cat cat_fighter){
        System.out.println(fight_value());
        System.out.println(cat_fighter.fight_value());

        if (fight_value()>cat_fighter.fight_value()){
            return true;
        }
        else {
            return false;
        }
    }

}
class  ComparatorBystrentch implements Comparator{
    public int compare ( Object o1, Object o2 ) { return ((Cat) o1).strength-((Cat) o2).strength; }
}

class ComparatorByage implements Comparator{
    public int compare ( Object o1, Object o2 ) {
        return (int)(((Cat) o1).age-((Cat) o2).age);
    }
}


