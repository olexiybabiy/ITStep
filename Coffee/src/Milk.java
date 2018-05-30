public class Milk extends Addons {
	
	private final float cost = 7f;
    private final String description = "Milk";
    
    float cost() {
        return cost + bavarage.cost();
    }

    String description() {
        return bavarage.description() + " " + description;
    }

    public Milk(Bavarage b){
       super(b);
    }
}