package identifiedObjects;

import java.util.Hashtable;

public class Disconnector extends Switch {

	public Disconnector(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
