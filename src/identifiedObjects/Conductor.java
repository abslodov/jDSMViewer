package identifiedObjects;

import java.util.Hashtable;

public abstract class Conductor extends ConductingEquipment {

	private float length;
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	public Conductor(Hashtable<String, String> objValues) {
		super(objValues);
	}

}
