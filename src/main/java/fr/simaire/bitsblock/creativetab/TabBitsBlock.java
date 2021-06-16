
package fr.simaire.bitsblock.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import fr.simaire.bitsblock.ElementsBitsBlock;

@ElementsBitsBlock.ModElement.Tag
public class TabBitsBlock extends ElementsBitsBlock.ModElement {
	public TabBitsBlock(ElementsBitsBlock instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabbitsblock") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.STRUCTURE_BLOCK, (int) (1), 4);
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static CreativeTabs tab;
}
