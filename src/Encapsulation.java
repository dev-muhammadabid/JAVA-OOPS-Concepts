public class Encapsulation {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setAge(21);
        System.out.println(p1.getAge());
    }
}

class Person{
    private int age;
    private String name;

    boolean canBeChanged = true;

    public void setAge(int age){
        if(canBeChanged){
            if (age > 0) {
                this.age = age;
            }
        }
    }

    public int getAge(){
        return age;
    }
}

