package identifiedObjects.enums;

public enum SwitchState {
		Open(0),
		Closed(1);

		private final int value;
	
	    private SwitchState(final int newValue) {
	        value = newValue;
	    }
	
	    public int getValue() { return value; }
	    
	    public static SwitchState convert (int p) {
	    	switch (p) {
	    		case 0: return Open;
	    		case 1: return Closed;
	    		default: throw new RuntimeException("Invalid SwitchState");
	    	}
	    }
    
}
