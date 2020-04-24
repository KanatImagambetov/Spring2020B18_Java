package day21_MultiDimentionalArrays;

public class ScrumTeam {
    public static void main(String[] args) {
        String[] DevTeam={"Zeinep", "Haider", "Jpodiv","Muhtar"};
        String[] Testers={"Rahman","Aishan","Osman","Ali"};
        String[] PO={"Barsy","Donald"};
        String[] TestersTeam2={"ildar","zarina","aizhan","asiman"};
        String[][] ScrumTeam={DevTeam,Testers,PO};
        ScrumTeam[1]=TestersTeam2;

        ScrumTeam[0][3]="Jean";
        System.out.println(ScrumTeam[0][3]);
        System.out.println("====================================");
        for(String each:ScrumTeam[2]){
            System.out.println(each);
        }
        System.out.println("=======================================");
        System.out.println(ScrumTeam[2][1]);
        System.out.println(ScrumTeam[1][0]);
    }
}
