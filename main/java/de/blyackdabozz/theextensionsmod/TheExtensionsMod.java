package de.blyackdabozz.theextensionsmod;

import static de.blyackdabozz.theextensionsmod.TheExtensionsModConstants.*;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

import de.blyackdabozz.theextensionsmod.proxy.CommonProxy;

@Mod(modid = MODID, name = NAME, version = VERSION)
public class TheExtensionsMod {

	@Instance
	private static TheExtensionsMod instance;
	
	public static TheExtensionsMod getInstance() {
		return instance;
	}
	
	@SidedProxy(serverSide = "de.blyackdabozz.theextensionsmod.proxy.CommonProxy", clientSide = "de.blyackdabozz.theextensionsmod.proxy.ClientProxy")
	private static CommonProxy proxy;
	
	@EventHandler
	public void preinit(FMLPreInitializationEvent event){
		proxy.preinit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.init(event);
	}
	
	@EventHandler
	public void postinit(FMLPostInitializationEvent event){
		proxy.postinit(event);
	}
}
