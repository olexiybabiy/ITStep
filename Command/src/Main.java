public class Main {
	
	public static void main(String[] args) {
		
		Lamp lamp = new Lamp();
		IComand lightOff = new LightOff(lamp);
	    IComand lightOn = new LightOn(lamp);

	    AirCondition air = new AirCondition();
	    IComand airCondRun = new AirCondRun(air);
	    IComand airCondStop = new AirCondStop(air);
	    IComand airCondSet = new AirCondSet(air);

	    lightOn.execute();
	    lightOff.execute();

	    System.out.println();

	    airCondRun.execute();
	    airCondSet.execute();
	    airCondStop.execute();
	}
}