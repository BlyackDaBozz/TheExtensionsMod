package de.blyackdabozz.theextensionsmod.init;


import de.blyackdabozz.theextensionsmod.TheExtensionsModConstants;
import de.blyackdabozz.theextensionsmod.item.ItemMagmaDust;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class TheExtensionsModItems {
	
	public static final ItemMagmaDust ItemMagmaDust = new ItemMagmaDust();

	public static void init() {
		setName(ItemMagmaDust, "ItemMagmaDust");
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		registry.register(ItemMagmaDust);
	}

	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(TheExtensionsModConstants.MODID, name));
		item.setUnlocalizedName(name);
	}
}
