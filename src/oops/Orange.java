package oops;

public class Orange extends Fruit {

    public Orange(String size) {
        super("Orange", "sour", size);
    }

    @Override
    public void eat() {
        System.out.println(name + " tastes " + taste + ", and it's usually " + size + " in size.");
    }
}

