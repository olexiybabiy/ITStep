public class AirCondStop implements IComand {
	
	private AirCondition air;

    public void execute() {
        
    	air.stop();
    }

    AirCondStop(AirCondition air){
        
    	this.air = air;
    }
}