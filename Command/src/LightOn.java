public class LightOn implements IComand {
	
	private Lamp lamp;
	
    public void execute() {
        
    	lamp.on();
    }

    LightOn(Lamp lamp){
        
    	this.lamp = lamp;
    }
}