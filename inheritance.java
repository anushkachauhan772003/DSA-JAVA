//reusability bdti h
//jise prop liye jate  h usse khte h base class jo leti hai sub class
//-4 types Inheritance->single inheri-->multiLevel Inheri-->Hiearchial inheritance-->hybrid--->multiple inheri popularly known as Interface
//Single level inheritance base----->derived
import Bank.Bank;
class Shape {
    String color;

    public static void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1 / 2 * l * h);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";

    }
}

// Packages:-
