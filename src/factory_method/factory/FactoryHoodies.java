package factory_method.factory;

import factory_method.clothes.Hoodies;

public class FactoryHoodies implements IFactory {
    private Hoodies hoodies;
    @Override
    public void createClothes() {
        this.hoodies = new Hoodies();
    }
    @Override
    public void showClothes() {
        createClothes();
        hoodies.showClothes();
    }
}
