package day20_Arrays;

public class repl {
    public static void main(String[] args) {
        String nums = "javaasjavaasajavanmnjjava";
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (nums.contains("java")) {
                nums=nums.replaceFirst("java", "");
                count++;
            }
        }
        System.out.println(count);
    }
}
