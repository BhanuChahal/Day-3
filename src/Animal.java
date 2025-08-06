public abstract class Animal {
    private String name;
    public Animal(){
    }
    public Animal(String name){
    this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void sleep();
    public abstract void roam();
    public abstract void makeNouse();

}
