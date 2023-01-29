class Pen{
    String color;
    String type;//gel,ball

    public void write(){
        System.out.println("write something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
class Student{
    String name;
    int age;
    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("constructor called");
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
}
public class oops{
    //making of object
    public static void main(String[]args){
        Pen pen1=new Pen();
        pen1.color="blue";//properties ko call krte hai dot lga kr
        pen1.type="gel";
        pen1.write();

        Pen pen2=new Pen();
        pen2.color="green";
        pen2.type="ball";
        pen2.write();

        Pen pen3=new Pen();
        pen3.color="red";
        pen3.printColor();

        Student s1=new Student("Ana",14);//Student()constructor object ko construct krta hai-->3 types non paramaterized ,paramaterized,
        //copy constructor-->ek jgh se copy krk dusre m daal dena
        //no retrun type ek baar hi call kra jata hai --bina student() k bhi code chla tha kyunki usne default non-para constructor
        //bna lia tha  
        Student s2=new Student(s1);
        s2.printName();


    }

}