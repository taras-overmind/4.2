
public class Main {

    public static void main(String[] args) {
        Figure f1=new Triangle(6, 8, 10);
        System.out.println(f1.calcPerimeter());
        System.out.println(f1.calcSquare());
        Figure f2=new Circle(5);
        System.out.println(f2.calcPerimeter());
        System.out.println(f2.calcSquare());
        Figure f3=new Rhombus(4, Math.PI/6);
        System.out.println(f3.calcPerimeter());
        System.out.println(f3.calcSquare());
        Figure f4= new Rectangle(2, 4);
        System.out.println(f4.calcPerimeter());
        System.out.println(f4.calcSquare());
        Figure f5 = new Square(5);
        System.out.println(f5.calcPerimeter());
        System.out.println(f5.calcSquare());
    }

}
