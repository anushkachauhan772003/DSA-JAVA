//multiple inheritancre

interface Animal{
    public void walks();
}
interface herbi{

}
class Horse implements Animal,herbi{
    public void walks(){
        System.out.println("horse walking......");
    }

}
public class oops3{
    public static void main(String args[]) {
        Horse horse=new Horse();
        horse.walks();

    }
}
