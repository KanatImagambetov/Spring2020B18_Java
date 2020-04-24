package day23_methods;

public class warmup {
    public static void main(String[] args) {
        String[] arr={"C", "B","A","A","E","C"};


        for(int i=0; i<=arr.length-1; i++){
            int count2=0;
            for(int j=0; j<=arr.length-1; j++){
                if(arr[i].equals(arr[j])){
                    count2++;
                }

            }
            if(count2==1){
                System.out.println(arr[i]);
            }
            }



        System.out.println("//==================================================================");

        for(String each2: arr){
               int count=0;
               for(String each: arr){
                   if(each.equals(each2)){
                   count++;
                }
          }
          if(count==1){
              System.out.print(each2);
          }
        }
        System.out.println();
        System.out.println("//==================================================================");
          int count=0;

        for(String each: arr){
            if(each.equals("A")){
                count++;
            }

        }
        if(count==1){
            System.out.println("A");
        }


    }
}
