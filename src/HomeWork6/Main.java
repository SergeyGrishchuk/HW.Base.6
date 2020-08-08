package HomeWork6;

import HomeWork6.animals.Cat;
import HomeWork6.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat(200,0);
        Dog dog = new Dog(500, 10);

        cat.swimming();
        dog.running();

    }
}

