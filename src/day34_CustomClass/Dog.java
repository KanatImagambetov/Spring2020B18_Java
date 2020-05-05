package day34_CustomClass;

public class Dog {
    String Breed;
    String size;
    int age;
    String color;
    String name;
    public void eating(String food){
        System.out.println(name+" is eating "+food);
    }
    public void drinking(String drink){

        System.out.println(name+" is drinking "+drink);
    }
    public void playing(String ball){
        System.out.println(name+" is playing "+ball);
    }
    public void studying(String study){
        System.out.println(name+" is studying "+study);
    }
    public void setDogInfo(String Breed, String size, int age, String color, String name){
/*        Breed=DogBreed;
        size=DogSize;
        age=DogAge;
        name=DogName;
        color=DogColor;

 */
        this.Breed=Breed;
        this.size=size;
        this.age=age;
        this.name=name;
        this.color=color;

    }
    public String toString(){
         return "Name: "+name+"\nSize: "+size+"\nColor: "+color+"\nBreed: "+Breed+"\nAge: "+age;
    }

}
