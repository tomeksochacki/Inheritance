package inheritanc.monster;

public class Zombies extends Monster{
    public String weaponType;
    public Zombies(){
        System.out.println("Default constructor from the class Zombie.");
    }

    public Zombies(double speedMove, double hotPoint){
        super(speedMove, hotPoint);
        System.out.println("Not default constructor from the class Zombie.");
    }

    public Zombies(double speedMove, double hotPoint, String weaponType){
        super(speedMove, hotPoint);
        this.weaponType = weaponType;
        System.out.println("Not default constructor from the class Zombie.");
    }

}
