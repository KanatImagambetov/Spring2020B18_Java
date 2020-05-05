package day34_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        Tester scrum1=new Tester();
        scrum1.setTesterInfo("Madina Imagak",1132332,"Developer",123455);

        ScrumTeam scrum=new ScrumTeam();
        scrum.hireTester(scrum1);
        System.out.println(scrum.testersTeam.size());
        scrum.fireTester(877655);
        System.out.println(scrum.testersTeam.size());
    }
}
