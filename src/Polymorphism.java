public class Polymorphism {
    public static void main(String[] args) {
        Data d = new Human();
        d.printData();  //Runtime Polymorphism or Method Overriding

        Data d2 = new Data();
        d2.printData(2);  //Compile Time Polymorphism or Method Overloading
    }
}
class Data{
    int data;
    public void printData(){
        System.out.println(data);
    }
    public void printData(int times){
        for (int i = 0; i < times; i++){
            System.out.println(data);
        }
    }
}

class Human extends Data{
    @Override
    public void printData(){
        System.out.println("Override " + data);
    }
}