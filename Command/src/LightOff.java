public class LightOff implements IComand {
	
	private Lamp lamp;
	
    public void execute() {
        
    	lamp.off();
    }
    
    LightOff(Lamp lamp){

    	this.lamp = lamp;
    }
}