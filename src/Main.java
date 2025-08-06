public class Main {
    public static void main(String[] args) {
//        int sum = 0;
//        for(String arg:args){
//            sum += Integer.parseInt(arg);
//        }
//        System.out.println("Sum:" +sum);

//        Animal animal = new Animal();
//        animal.makeNouse();
//
//        Cat an = new Cat();
//        an.jump();
//
//        Animal a = new Cat();
//        a.makeNouse();
//
//        Cat c = (Cat)a;
//        c.jump();

        Dog d = new Dog("Tisson");
        Cat c = new Cat("Jackie");
        Bat b = new Bat("Corona");
        Fish f = new Fish("Nemo");
        Parrot p = new Parrot("Maverick");
        Ostrich o = new Ostrich("Havick");

        p.makeNouse();
        c.jump();
        f.eat();
        b.sleep();
        d.eat();
//        AnimalUtils util = new AnimalUtils();
//        util.addAnimal(d);
//        util.addAnimal(c);
    }

}

