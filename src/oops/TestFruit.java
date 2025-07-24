package oops;

public class TestFruit {
    public static void main(String[] args) {
        Apple apple = new Apple("medium");
        Orange orange = new Orange("small");

        apple.eat();   // Output: Apple tastes sweet, and it's usually medium in size.
        orange.eat();  // Output: Orange tastes sour, and it's usually small in size.
    }
}
