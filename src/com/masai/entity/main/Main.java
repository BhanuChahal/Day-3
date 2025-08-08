package com.masai.entity.main;
import com.masai.entity.entity.*;



import java.lang.management.MonitorInfo;

import static com.masai.entity.entity.Day.FRIDAY;
import static com.masai.entity.entity.Day.MONDAY;
import static com.masai.entity.entity.Role.ADMIN;

public class Main {
    public int sum(int... numbers){
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
    public static void main(String[] args){
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
//
//        Dog d = new Dog("Tisson");
//        Cat c = new Cat("Jackie");
//        Bat b = new Bat("Corona");
//        Fish f = new Fish("Nemo");
//        Parrot p = new Parrot("Maverick");
//        Ostrich o = new Ostrich("Havick");
//
//        p.makeNouse();
//        c.jump();
//        f.eat();
//        b.sleep();
//        d.eat();
//        AnimalUtils util = new AnimalUtils();
//        util.addAnimal(d);
//        util.addAnimal(c);
//          Parrot parrot=new Parrot("pikku");
//          parrot.fly();
//
//
//        Role role= ADMIN;
//        switch (role){
//            case ADMIN:
//                System.out.println("ADMIN aagaya");
//                break;
//
//            case USER:
//                System.out.println("USER aagaya");
//                break;
//
//            case GUEST:
//                System.out.println("GUEST aagaya");
//                break;
//
//            default:
//                System.out.println("SAB aagaey");
//        }
//        Status s=Status.SUCCESS;
//        System.out.println("Status: " +s);
//        System.out.println("Code: "+s.getCode());

          MatOperations add=(a,b)-> a+b;
          MatOperations multiply=(a,b)-> a*b;

        System.out.println(add.operate(4,8));
        System.out.println(multiply.operate(4,8));

    }

}

