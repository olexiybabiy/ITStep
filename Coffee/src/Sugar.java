public class Sugar extends Addons {
	
	private final float cost = 3f;
    private final String description = "Sugar";

    Sugar(Bavarage bavarage) {
        super(bavarage);
    }

    float cost() {
        return cost + bavarage.cost();
    }

    String description() {
        return bavarage.description()+" "+description;
    }
}