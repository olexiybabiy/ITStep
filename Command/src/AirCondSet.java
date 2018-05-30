public class AirCondSet implements IComand {
	
	private AirCondition air;

    public void execute() {
        
    	air.set();
    }

    AirCondSet(AirCondition air){
        
    	this.air = air;
    }
}