package day33_CustomClass;

public class cat {
    String color;
    String breed;
    int age;
    String name;

    public void sleep() {
        System.out.println(name+" is sleeping");
    }
    public void eat(String catFood) {
        System.out.println(name+" is eating"+catFood);
    }
    public void drink(String drink) {
        System.out.println(name+" is dringing "+drink);
    }
    public void setCatInfo(String catbreed, String catcolor, String catname, int catage) {
     breed=catbreed;
     color=catcolor;
     age=catage;
     name=catname;
    }

    public String toString() {
        String res=name+", "+breed+", "+color+", "+age;
        return res;
    }
}
