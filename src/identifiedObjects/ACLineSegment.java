package identifiedObjects;

import java.util.Hashtable;

public class ACLineSegment extends ConductingEquipment {

	private ConductingEquipment parentEquipment; 
	private float length;
	
	public ConductingEquipment getParentEquipment() {
		return parentEquipment;
	}

	private void setParentEquipment(ConductingEquipment parentEquipment) {
		this.parentEquipment = parentEquipment;
	}
	
	private void ConnectivityNode getNeighbor(Terminal term) {
		this.parentEquipment = newParentEquipment;
		
	
	}
	
	
	public ACLineSegment(Hashtable<String, String> objValues) {
		super(objValues);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String state() {
		// TODO Auto-generated method stub
		return null;
	}

}
