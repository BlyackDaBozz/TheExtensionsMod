package de.blyackdabozz.theextensionsmod.proxy;

import de.blyackdabozz.theextensionsmod.init.TheExtensionsModItems;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preinit(FMLPreInitializationEvent event) {
		TheExtensionsModItems.init();
		
		MinecraftForge.EVENT_BUS.register(TheExtensionsModItems.class);
	}

	public void init(FMLInitializationEvent event) {
		
	}

	public void postinit(FMLPostInitializationEvent event) {
		
	}

}
