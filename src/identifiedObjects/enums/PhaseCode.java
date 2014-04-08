package identifiedObjects.enums;

public enum PhaseCode {
		None(0),
		A(1),
		B(2),
		C(3),
		N(4);

		private final int value;

        private PhaseCode(final int newValue) {
            value = newValue;
        }

        public int getValue() { return value; }
        
        public static PhaseCode convert (int p) {
        	switch (p) {
        		case 0: return None;
        		case 1: return A;
        		case 2: return B;
        		case 3: return C;
        		case 4: return N;
        		default: throw new RuntimeException("Invalid Phase Code");
        	}
        }
        
        public static PhaseCode convert (String s) {
        	switch(s) {
        	case "None": return None;
        	case "A": return A;
        	// TODO finish this...
        	}
        }
        

}
