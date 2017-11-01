package creational.abstractfactory;

/**
 * Created by abhijit on 11/2/2017.
 */
public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = AbstractFactory.getFactory(AssembleType.ASSEMBLE_A);
        AbstractProductA productA = factory.createProductA();
        AbstractProductB productB = factory.createProductB();
        // Same for Assemble type B
    }
}
