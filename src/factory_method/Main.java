package factory_method;

import factory_method.factory.FactoryHoodies;
import factory_method.factory.FactoryTShirt;
import factory_method.factory.IFactory;

public class Main {
    public static void main(String[] args) {
        showFactoryMethod(new FactoryHoodies());
        System.out.println("----------------");
        showFactoryMethod(new FactoryTShirt());
    }
    public static void showFactoryMethod(IFactory factory) {
        factory.showClothes();
    }
}
