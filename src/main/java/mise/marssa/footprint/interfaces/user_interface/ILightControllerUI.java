package mise.marssa.footprint.interfaces.user_interface;

import mise.marssa.footprint.data_types.MBoolean;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ILightControllerUI {

	public MBoolean getNavigationLightStatus();

	public MBoolean toggleNavigationLights();

}