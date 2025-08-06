public class Fish extends Animal{
    public Fish() {
    }

    public Fish(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void roam() {
        System.out.println(getName()+" is roaming");
    }

    @Override
    public void makeNouse() {
        System.out.println(getName()+" is making noise");
    }
}
