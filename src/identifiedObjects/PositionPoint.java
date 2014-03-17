package identifiedObjects;

import java.util.Hashtable;

public class PositionPoint extends IdentifiedObject {

	private static String coordinateSystem;
	private float xPosition;
    private float yPosition;
    
    public static String getCoordinateSystem() {
		return coordinateSystem;
	}

	public float getxPosition() {
		return xPosition;
	}

	public float getyPosition() {
		return yPosition;
	}

		
	
	
	public PositionPoint(Hashtable<String, String> objValues) {
		super(objValues);
		this.xPosition = Float.parseFloat(objValues.get("xPosition"));
		this.yPosition = Float.parseFloat(objValues.get("yPosition"));
	}


}
