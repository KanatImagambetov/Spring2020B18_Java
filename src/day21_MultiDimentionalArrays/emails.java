package day21_MultiDimentionalArrays;

public class emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@yahoo.com", "Cybertek@hotmail.com", "Cybertek@outlook.com"};

        for(String gmail: emails){
            if(gmail.endsWith("gmail.com")){
                continue;
            }
            System.out.print(gmail);
        }

    }
}
