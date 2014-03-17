package identifiedObjects;

import java.util.Hashtable;
import identifiedObjects.enums.EquipmentTopoTypes;


public abstract class Equipment extends PowerSystemResource {

	protected boolean aggregate;
	protected EquipmentTopoTypes equipmentType;
	
	public EquipmentTopoTypes getEquipmentType() {
		return equipmentType;
	}

	public boolean isAggregate() {
		return aggregate;
	}

	protected void setAggregate(boolean aggregate) {
		this.aggregate = aggregate;
	}

	protected abstract String state();
	
	public Equipment(Hashtable<String, String> objValues) {
		super(objValues);
	}


}