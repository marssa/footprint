package mise.marssa.interfaces.user_interface;

import mise.marssa.data_types.Boolean;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ILightControllerUI {

	public Boolean getNavigationLightStatus();

	public Boolean toggleNavigationLights();

}