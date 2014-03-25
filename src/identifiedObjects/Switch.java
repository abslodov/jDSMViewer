package identifiedObjects;

import identifiedObjects.enums.EquipmentTopoTypes;
import identifiedObjects.enums.SwitchState;

import java.util.Hashtable;

public class Switch extends ConductingEquipment {

	private boolean normallyopen;
	private SwitchState state;
	
	public SwitchState getState() {
		return state;
	}

	public void setState(SwitchState state) {
		this.state = state;
	}
	
	public boolean isOpen() {
		return normallyopen;
	}

	public void setOpen(boolean normallyopen) {
		this.normallyopen = normallyopen;
	}
	
	
	public Switch(Hashtable<String, String> objValues) {
		super(objValues);
		this.equipmentType = EquipmentTopoTypes.Switch;
		this.state = SwitchState.convert(Integer.parseInt(objValues.get("SwitchState")));
		if (normallyopen)
        {
            this.state = SwitchState.Open;
        }
        else
        {
            this.state = SwitchState.Closed;
        }
		
	}

	@Override
	protected String state() {
		return null;
	}

}
