package identifiedObjects;

import java.util.HashSet;
import java.util.Hashtable;

public class ACLineSegment extends Conductor {

	private double[][] phaseImpedance; 	
	private float length;
	
	
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}
	
	public double[][] getPhaseImpedance() {
		return phaseImpedance;
	}


	public void setPhaseImpedance(double[][] phaseImpedance) {
		this.phaseImpedance = phaseImpedance;
	}


	public ACLineSegment(Hashtable<String, String> objValues) {
		super(objValues);
	}


}
