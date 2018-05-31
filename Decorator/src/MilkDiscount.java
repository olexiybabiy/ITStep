public class MilkDiscount extends Decorator {

    protected MilkDiscount(Product product){
        super(product);
    }

    @Override
    public int getPrice() {
        return this.product.getPrice() - 10;
    }
}
