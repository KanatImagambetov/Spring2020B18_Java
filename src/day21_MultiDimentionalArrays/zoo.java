package day21_MultiDimentionalArrays;

public class zoo {
    public static void main(String[] args) {
        String[] wildanimals = {"tiger", "lion", "monkey", "wolf"};
        String[] birds = {"eagles", "ducks", "peacock", "chicken"};
        String[][] zoo = {wildanimals, birds};

        String bird3 = zoo[1][3];

        System.out.println(bird3);
        System.out.println("//===========================================");
        for (String birdsall : zoo[1]) {
            if (birdsall.equals("chicken")) {
                continue;
            }
            System.out.println(birdsall);
            System.out.println("//===========================================");
            for (String wilds : zoo[0]) {
                if (wilds.equals("tiger")) {
                    continue;
                }
                System.out.println(wilds);
            }

        }
    }
}
