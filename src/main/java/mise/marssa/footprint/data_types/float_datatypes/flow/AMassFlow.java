package mise.marssa.footprint.data_types.float_datatypes.flow;

import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

public abstract class AMassFlow extends UnsignedFloat {
	//TODO Define AMassFlow methods
	
	public AMassFlow(float value) throws OutOfRange {
		super(value);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mass Flow in " + this.getClass().getSimpleName() + " = " + value;
	}
}
