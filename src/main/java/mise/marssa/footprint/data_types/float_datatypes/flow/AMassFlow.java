package mise.marssa.footprint.data_types.float_datatypes.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "AMassFlow", factoryClass = TypeFactory.class, factoryMethod = "getAMassflowInstance")
public abstract class AMassFlow extends UnsignedFloat {
	
	//TODO Define AMassFlow methods
	
	public AMassFlow(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public String toString() {
		return "Mass Flow in " + this.getClass().getSimpleName() + " = " + value;
	}
}
