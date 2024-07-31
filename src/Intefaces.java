public class Intefaces {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eats();
        cat.owner();
        System.out.println(Animal.legs);
    }
}

interface Animal{
    public static final int legs = 4;                       //In interfaces, we can only define static or final

    void eats();

    default void walk(){
        System.out.println("Animal is Walking");
    }
}

interface Pet{
    void owner();
}

 class Cat implements Animal, Pet{
    @Override
     public void eats(){
        System.out.println("Cat is eating");
    }

    @Override
     public void owner(){
        System.out.println("Dev is the Owner");
    }
 }