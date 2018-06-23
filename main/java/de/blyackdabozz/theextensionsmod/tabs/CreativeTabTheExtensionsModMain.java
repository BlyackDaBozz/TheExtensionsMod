package de.blyackdabozz.theextensionsmod.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class CreativeTabTheExtensionsModMain extends CreativeTabs {

	public CreativeTabTheExtensionsModMain() {
		super("maintab");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Items.BREAD);
	}

}
