import java.util.Random;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }


    int hit(Fighter foe) {
        System.out.println("-------------");
        System.out.println(this.name + " hit " + foe.name + " with " + this.damage + " damage.");

        if (foe.dodge()) {
            System.out.println(foe.name + " dodged the incoming damage.");
            return foe.health;
        }
        if (foe.health - this.damage < 0)
            return 0;

        return this.health - this.damage;
    }


    boolean dodge() {
        Random random = new Random();
        double randomValue = random.nextDouble() * 100;
        return randomValue <= this.dodge;
    }
}
