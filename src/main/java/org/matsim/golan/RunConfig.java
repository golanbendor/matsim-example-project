package golan;

import org.matsim.core.config.Config;
import org.matsim.core.config.ConfigUtils;
import org.matsim.core.controler.AbstractModule;
import org.matsim.core.controler.Controler;
import org.matsim.core.controler.OutputDirectoryHierarchy.OverwriteFileSetting;

public class RunConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Config config = ConfigUtils.loadConfig("input/tlv_pt_sample/config_commandline.xml");
		Config config = ConfigUtils.loadConfig("D:/MatsimTA/matsim-example-project/input/network9flow15/configtest.xml");
		Controler controler = new Controler(config);
		config.controler().setOverwriteFileSetting( OverwriteFileSetting.deleteDirectoryIfExists );
		config.controler().setOutputDirectory("D:/MatsimTA/matsim-example-project/output/network9flow15");

		
		controler.run();
	}

}