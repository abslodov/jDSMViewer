package identifiedObjects;

import identifiedObjects.enums.EquipmentTopoTypes;
import identifiedObjects.enums.SwitchState;

import java.util.Hashtable;

public abstract class Switch extends ConductingEquipment {

	private boolean normallyopen;
	private SwitchState state;
	
	public SwitchState getState() {
		return state;
	}

	public void setState(SwitchState state) {
		this.state = state;
	}
	
	public boolean isOpen() {
		return state == SwitchState.Open;
	}
	
	public Switch(Hashtable<String, String> objValues) {
		super(objValues);
		this.normallyopen = Boolean.parseBoolean(objValues.get("NormalOpen"));
		this.equipmentType = EquipmentTopoTypes.Switch;
		this.state = SwitchState.convert(Integer.parseInt(objValues.get("SwitchState")));			
	}

}
