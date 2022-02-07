import AbstractFactory.*;
class Main {


  public static void main(String[] args) {
    System.out.println("Hello world!");

AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
Shape shape= shapeFactory.getShape("Rectangle");
shape.draw();


  }
}