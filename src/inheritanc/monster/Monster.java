package inheritanc.monster;

public class Monster {
    public double speedMove;
    public double hitPoint;

    public void attack(){
        /*
        /
        */
        System.out.println("This is method attack with class Monster.");
    }

    public Monster(){
        System.out.println("Default constructor from the class Monster.");

    }
    public Monster(double speedMove, double hitPoint){
        this.speedMove = speedMove;
        this.hitPoint = hitPoint;
        System.out.println("Not default constructor from the class Monster.");

    }
}
