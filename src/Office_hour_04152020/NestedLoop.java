package Office_hour_04152020;

public class NestedLoop {
    public static void main(String[] args) {
        int[][] numbers = {
                {1,2,3},
                {4,5,6,7,8,9},
                {10,11,12,13,14},
                {15,16,17,18,19,20,21}
        };

        for(int i=0; i< numbers.length;i++){
            for(int j=0; j< numbers[i].length;j++){
                if(numbers[i][j]%2!=0) {
                    System.out.print(numbers[i][j]+" ");
                }
            }
        }
        System.out.println();
        for(int[] each1D: numbers){
            for(int each : each1D){
                if(each%2!=0) {
                    System.out.print(each+" ");
                }
            }
        }


    }
}
