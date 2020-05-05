package day34_CustomClass;

public class DogObj2 {
    public static void main(String[] args) {
        String food="Chicken";
        String food1="Fish";

        String drink="coffee";
        String drink1="milk";

        String ball="piano";

        String str="Java";

        Dog dog1=new Dog();
        dog1.setDogInfo("Alabay","Big",23,"White","Boss");
        Dog dog2=new Dog();
        dog2.setDogInfo("Poodle","Miniature",3,"Brown","Nice");

        dog2.eating(food);
        dog1.eating(food1);
        dog2.drinking(drink);
        dog1.drinking(drink1);
        dog1.playing(ball);

        Dog dog3=new Dog();
        dog3.setDogInfo("Alabay","Big",23,"White","Boss");
        Dog dog4=new Dog();
        dog4.setDogInfo("Poodle","Miniature",3,"Brown","Nice");

        System.out.println("===================================================");
        Dog[] dogPArk={dog1,dog2,dog3,dog4};

        for (int i=0;i<dogPArk.length; i++){
            dogPArk[i].eating("Chicken");
        }

        for(Dog each:dogPArk){
            each.drinking("water");
        }

        for (int i=0;i<dogPArk.length;i++){
            dogPArk[i].playing("foodball");
        }
        for(Dog each:dogPArk){
            each.studying(str);
        }

    }
}
