public class Animal {
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
    public void eat(){
        System.out.println(name+ " eating");

    }
    public void sleeo(){
        System.out.println(name+" sleeping");
    }
    public void raom(){
        System.out.println(name+" roaming");
    }
    public void makeNouse(){
        System.out.println(name+" made noise");
    }

}
