package oops;

public class Apple extends Fruit {

    public Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste + ", and it's usually " + size + " in size.");
    }
}

