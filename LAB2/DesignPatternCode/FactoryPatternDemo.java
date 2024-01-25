package LAB2.DesignPatternCode;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = ShapeFactory.getInstance();

        Shape shape1 = ShapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = ShapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
