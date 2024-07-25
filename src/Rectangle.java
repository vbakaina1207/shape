public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle( String color, boolean isFilled, double width, double height){
        super(color, isFilled);
        if (width<= 0 || height<= 0 )
            throw  new IllegalArgumentException("Width and length must be positive");
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }

    @Override
    public double getPerimeter() {
        return 2*(width + height);
    }



}
