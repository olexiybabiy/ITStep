public class Shop {
    public static void main(String[] args){

        Product milk = new Milk(50);

        Product milkDiscount = new MilkDiscount(milk);

        System.out.print(milkDiscount.getPrice());
    }
}
