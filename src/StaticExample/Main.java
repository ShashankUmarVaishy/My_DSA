package StaticExample;

public class Main {
    public static void main(String[] args) {
        Human Shashank= new Human(21,"Shashank Umar Vaishy",0,true);
        System.out.println(Human.population);
        Human Mayank= new Human(19,"Mayank Umar Vaishy",0,false);
        System.out.println(Human.population);
    }
}
