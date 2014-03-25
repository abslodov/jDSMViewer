package identifiedObjects;

import java.util.Hashtable;

public class Breaker extends Switch {

	public Breaker(Hashtable<String, String> objValues) {
		super(objValues);
	}
	
	@Override
	protected String state() {
		return null;
	}

}
