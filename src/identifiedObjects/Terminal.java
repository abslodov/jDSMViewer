package identifiedObjects;

import identifiedObjects.enums.PhaseCode;

import java.util.Hashtable;

public class Terminal extends IdentifiedObject {

	private ConductingEquipment parentEquipment; 
	private ConnectivityNode connectionPoint;
	private String connectionPointName;
	private PhaseCode phases;
	private boolean connected;
	private Location location;
	private int sequenceNumber;
    
	public ConductingEquipment getParentEquipment() {
		return parentEquipment;
	}

	private void setParentEquipment(ConductingEquipment parentEquipment) {
		this.parentEquipment = parentEquipment;
	}

	public ConnectivityNode getConnectionPoint() {
		return connectionPoint;
	}

	public void setConnectionPoint(ConnectivityNode connectionPoint) {
		this.connectionPoint = connectionPoint;
	}

	public String getConnectionPointName() {
		return connectionPointName;
	}

	private void setConnectionPointName(String connectionPointName) {
		this.connectionPointName = connectionPointName;
	}

	public PhaseCode getPhases() {
		return phases;
	}

	public void setPhases(PhaseCode phases) {
		this.phases = phases;
	}

	public boolean isConnected() {
		return connected;
	}

	public void setConnected(boolean connected) {
		this.connected = connected;
	}

	public Location getLocation() {
		return location;
	}

	private void setLocation(Location location) {
		this.location = location;
	}
	
	public int getSequenceNumber() { return sequenceNumber; }
	public void setSequenceNumber(int sequenceNumber) { this.sequenceNumber = sequenceNumber; }
	
	
	public Terminal(Hashtable<String, String> objValues, ConductingEquipment newParentEquipment) {
		super(objValues);
		this.connectionPointName = objValues.get("ConnectionPoint");
	    this.parentEquipment = newParentEquipment;
	    this.phases = PhaseCode.convert(Integer.parseInt(objValues.get("Phases")));
	}
	
	public Terminal() { }
}



       
