public class AirCondRun implements IComand {
	
	private AirCondition air;

    public void execute() {
        
    	air.run();
    }

    AirCondRun(AirCondition air){
        
    	this.air = air;
    }
}