public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is barking!!");
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " is sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName() + " is roaming");
    }

    @Override
    public void makeNouse() {
        System.out.println(getName() + " is making noise");
    }

    public void play() {
        System.out.println(getName() + " is playing!!");
    }
}