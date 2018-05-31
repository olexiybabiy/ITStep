public class Milk implements Product {
    private final int price;

    Milk(final int price){
        this.price = price;
    }


    @Override
    public int getPrice() {
        return this.price;
    }
}
