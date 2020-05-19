package inheritanc.monster;

public class Skeleton extends Monster {
    public String weaponType;
    public Skeleton(){
        System.out.println("Default constructor from the class Skeleton.");
    }

    public Skeleton(double speedMove, double hotPoint) {
        super(speedMove, hotPoint);
        System.out.println("Not default constructor from the class Skeleton.");

    }

    public Skeleton(double speedMove, double hotPoint, String weaponType) {
        super(speedMove, hotPoint);
        this.weaponType = weaponType;
        System.out.println("Not default constructor from the class Skeleton.");

    }


}
