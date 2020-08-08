package HomeWork6;

import HomeWork6.animals.Cat;
import HomeWork6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(150,10);
        Dog dog = new Dog(350, 9);

        cat.swimming();
        dog.running();

    }
}

