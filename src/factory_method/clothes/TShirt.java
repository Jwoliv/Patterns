package factory_method.clothes;

public class TShirt implements IClothes {
    @Override
    public void showClothes() {
        System.out.println("Show the T-shirt");
    }
}
