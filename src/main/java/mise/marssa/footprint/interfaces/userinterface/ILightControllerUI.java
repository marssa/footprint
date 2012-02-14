package mise.marssa.footprint.interfaces.userinterface;

import mise.marssa.footprint.datatypes.MBoolean;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ILightControllerUI {

	public MBoolean getNavigationLightStatus();

	public MBoolean toggleNavigationLights();

}