package golan;

import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.AbstractModule;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy.OverwriteFileSetting;

public class RunConfigWithOwnEventHandlers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Config config = ConfigUtils.loadConfig("input/tlv_pt_sample/config_commandline.xml");
		Config config = ConfigUtils.loadConfig("C:/Users/golan/git/matsim-example-project/input/‏‏basicdemandgeneartiontelaviv/config.xml");
		Controler controler = new Controler(config);
		config.controler().setOverwriteFileSetting( OverwriteFileSetting.deleteDirectoryIfExists );
		
		controler.addOverridingModule(new AbstractModule() {
			
			@Override
			public void install() {
				addEventHandlerBinding().to(SimpleTollExampleHandler.class).asEagerSingleton();	
				addEventHandlerBinding().to(LinkEnterEventsHandlerExample.class).asEagerSingleton();
				addEventHandlerBinding().to(SimpleCapacityExampleHandler.class).asEagerSingleton();				
			}
		});
		
		controler.run();
	}

}
