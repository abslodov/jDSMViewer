package identifiedObjects;

import java.util.Hashtable;

public class Disconnector extends ConductingEquipment {

	public Disconnector(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
