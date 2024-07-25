public class Main {
    public static void main(String[] args) {
        //Shape circle = new Circle("Yellow", true, 5.0);
        Shape circle = new Circle("Purple", true, 4.5);
        Shape rectangle = new Rectangle("Blue", false, 3.1, 4.0);
        Shape square = new Square("Green", true, 5.0);

        printShape(circle);
        printShape(rectangle);
        printShape(square);
    }

    public static void printShape(Shape shape){
        System.out.println();
        System.out.println(shape.getClass());
        System.out.println("-------------------");
        System.out.println("Color: " + shape.getColor());
        System.out.println("Is filled: " + shape.getFilled());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}
