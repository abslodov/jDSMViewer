package identifiedObjects;

import java.util.Hashtable;

public class Fuse extends ConductingEquipment {

	
	public Fuse(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
