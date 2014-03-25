package identifiedObjects;

import java.util.Hashtable;

public class Jumper extends ConductingEquipment {

	public Jumper(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
