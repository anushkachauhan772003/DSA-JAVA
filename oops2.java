abstract class Animal{
     abstract void walk(); 
     Animal(){
        System.out.println("you r creating a new Animal");
     }
}
class Horse extends Animal{
    Horse(){
        System.out.println("created a horse");
    }
    public void walk(){
        System.out.println("walks on 4legs");
    }
}
class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class oops2 {
    public static void main(String args[]) {
        Horse horse=new Horse();
       
        
    }
    
}
