package identifiedObjects;

import java.util.Hashtable;

public class Recloser extends ConductingEquipment {

	public Recloser(Hashtable<String, String> objValues) {
		super(objValues);
	}

	@Override
	protected String state() {
		return null;
	}

}
