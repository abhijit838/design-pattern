package creational.abstractfactory;

/**
 * Created by plank-abhijit on 11/1/2017.
 */
enum AssembleType {
    PRODUCT_A,
    PRODUCT_B
}
abstract class AbstractFactory {
    private static final ProductAssembleOne PRODUCT_FACTORY_A = new ProductAssembleOne();
    private static final ProductAssembleTwo PRODUCT_FACTORY_B = new ProductAssembleTwo();

    static AbstractFactory getFactory(AssembleType familyType) {
        AbstractFactory factory = null;
        switch (familyType) {
            case PRODUCT_A:
                factory = PRODUCT_FACTORY_A;
                break;
            case PRODUCT_B:
                factory = PRODUCT_FACTORY_B;
                break;
        }
        return factory;
    }
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}

class ProductAssembleOne extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return null;
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}

class ProductAssembleTwo extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return null;
    }

    @Override
    public AbstractProductB createProductB() {
        return null;
    }
}

abstract class AbstractProductA {

}

class ProductA1 extends AbstractProductA {

}
class ProductA2 extends AbstractProductA {

}

abstract class AbstractProductB {

}

class ProductB1 extends AbstractProductB {

}
class ProductB2 extends AbstractProductB {

}
