package testing;

/**
 * Created by keen on 9/16/14.
 */
public abstract class AbstractFactory {
    abstract Color getColor(String color);
    abstract Shape getShape(String shape);
}
