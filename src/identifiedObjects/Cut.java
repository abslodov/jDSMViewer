package identifiedObjects;

import java.util.Hashtable;

public class Cut extends ConductingEquipment {

	public Cut(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
