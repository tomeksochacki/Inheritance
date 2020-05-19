package inheritance;

import inheritanc.monster.Monster;
import inheritanc.monster.Skeleton;
import inheritanc.monster.Zombies;

public class Inheritance {
    public static void main(String[] args) {
        Monster m = new Monster(10, 100);
        Skeleton s = new Skeleton(20, 50, "gun");
        Zombies z = new Zombies(5, 40, "hand");

        System.out.println(m.speedMove);
        System.out.println(s.speedMove);
        System.out.println(s.weaponType);
        System.out.println(z.speedMove);
        System.out.println(z.weaponType);
    }
}
