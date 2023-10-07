public class Match {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }


    public void run() {
        if (isCheck()) {
            if (Math.random() < 0.5) {
                System.out.println(f1.name + " will start the fight!");
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== NEW ROUND ===========");
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            } else {
                System.out.println(f2.name + " will start the fight!");
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== NEW ROUND ===========");
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    printScore();
                }
            }

        } else {
            System.out.println("Weights of the fighters do not match.");
        }
    }

    boolean isCheck() {
        return ((f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight));
    }

    boolean isWin() {
        if (f1.health <= 0) {
            System.out.println("The winner is: " + f2.name);
            return true;
        } else if (f2.health <= 0) {
            System.out.println("The winner is: " + f1.name);
            return true;
        }
        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Remaining Health: " + f1.health);
        System.out.println(f2.name + " Remaining Health: " + f2.health);
    }

}