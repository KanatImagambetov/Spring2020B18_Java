package day19_Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        String[] friends={"Mike", "Asiya", "Kant", "Atlaty"};

        String num2=friends[2];
        System.out.println(num2);
        for(int i=0; i<=3; i++){
            System.out.println(friends[i]);
        }


        String[] emails={"cybertek@gmail.com", "kanat@gmail.com", "cybertek@hotmail.com", "cybertek@outlook.com", };
//        boolean res="";
        for(int i=0; i<=3; i++){

            String email=emails[i];
            if(email.endsWith("gmail.com")){
                System.out.println(email);
            }

        }
//        System.out.println(res);

    }
}
