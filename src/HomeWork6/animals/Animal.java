package HomeWork6.animals;

import java.util.Random;

public class Animal {
    int run;
    int swim;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }


    public void swimming() {
        Random rand = new Random();
        int swim = rand.nextInt(24);
        if(swim >= 0 && swim < 11) {
            System.out.println("Cat cannot swimming\n" + "Dog swimming " + swim);
        } else {
            System.out.println("Too much distanse for Cat & Dog");
        }
    }


    public void running() {
        Random rand = new Random();
        int run = rand.nextInt(750);
        if(run > 200 && run > 500) {
            System.out.println("Too much distance for Cat & Dog");
        } else if(run > 200 && run < 500) {
            System.out.println("Too much distance for a cat\n" + "Dog run " + run);
        } else if(run < 201 && run < 501) {
            System.out.println("Cat run " + run + "\n" + "Dog run " + run);
        }
    }
}
