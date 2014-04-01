package identifiedObjects;

import java.util.Hashtable;

public abstract class Conductor extends ConductingEquipment {

	private float length;
	private ConductingEquipment parentEquipment;
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	public ConductingEquipment getParentEquipment() {
		return parentEquipment;
	}

	public void setParentEquipment(ConductingEquipment parentEquipment) {
		this.parentEquipment = parentEquipment;
	}

	
	protected ConnectivityNode getOtherNeighbor(Terminal term)
    {
        Conductor parentConductor = parentEquipment.getTerminal1();
        if (term == parentEquipment.getTerminal1())
        {
            return parentConductor.getConnectionPoint();
        }
        if (term == parentEquipment.getTerminal2())
        {
            return parentConductor.getConnectionPoint();
        }
        return null;
    }
	
	public Conductor(Hashtable<String, String> objValues) {
		super(objValues);
	}

}
