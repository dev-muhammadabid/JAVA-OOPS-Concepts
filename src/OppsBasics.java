public class OppsBasics {
    public static void main(String[] args) {
        System.out.println("OOPS BASICS");
        System.out.println("Classes & Object, Constructor, Method Overloading");
    }
}

/*
Classes & Objects

//Making a Class and Objects
class Cat{
    String name;
    int age;
    String color;

    void walk(){
        System.out.println(name + " is Walking");
    }

    void catInfo(){
        System.out.println("Cat name is " + name);
        System.out.println("Cat age is " + age);
        System.out.println("Cat color is " + color);
    }
}

//Parameters in Main Functions
 Cat c1 = new Cat();
        c1.name = "Simba";
        c1.age = 6;
        c1.color = "Lion Shade";
        c1.catInfo();
        c1.walk();
*/


/*
Constructor

class Complex{
    int a, b;

    //Constructor
    public Complex(int num1, int num2){                 //Default Constructor assign the value null meant 0
        a = num1;
        b = num2;
    }

    void print(){
        System.out.println("a = " + a + " AND " + "b = " + b );
    }
}

//Parameters in Main Functions
Complex c1 = new Complex(5,3); // So you have to give some parameters
        c1.print();
*/


/*
Method Overloading

class Greet{
    void greeting(){
        System.out.println("Hey, Good Morning");
    }
    void greeting(String name){                                 //Same Name But Different Parameters
        System.out.println("Hey, " + name + " Good Morning");
    }
}

//Parameters in Main Functions
Greet obj = new Greet();
        obj.greeting();
        obj.greeting("ABii");
*/