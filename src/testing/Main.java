package testing;

public class Main{

    public static void main(String[] args) {

        System.out.println("Hello World!");

        AbstractFactory shapeFactory= FactoryProducer.getFactory("SHAPE");

        Shape shape1=shapeFactory.getShape("CIRCLE");
        shape1.draw();
        shape1.draw();
        System.out.println("WTF :D ");
        System.out.println();

        Shape shape2=shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3=shapeFactory.getShape("SQUARE");
        shape3.draw();



        shape1.draw();
        shape2.draw();
        shape3.draw();


        AbstractFactory colorFactory=FactoryProducer.getFactory("COLOR");

        Color colorRed=colorFactory.getColor("RED");
        colorRed.fill();



        shape3.draw();
        colorRed.fill();

    }

}