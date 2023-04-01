package factory_method.factory;

import factory_method.clothes.TShirt;

public class FactoryTShirt implements IFactory {
    private TShirt tShirt;
    @Override
    public void createClothes() {
        tShirt = new TShirt();
    }
    @Override
    public void showClothes() {
        createClothes();
        tShirt.showClothes();
    }
}
