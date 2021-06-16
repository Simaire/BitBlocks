
package fr.simaire.bitsblock.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.Block;

import fr.simaire.bitsblock.creativetab.TabBitsBlock;
import fr.simaire.bitsblock.ElementsBitsBlock;

@ElementsBitsBlock.ModElement.Tag
public class BlockBitsBucheDeLaJungle extends ElementsBitsBlock.ModElement {
	@GameRegistry.ObjectHolder("bitsblock:bitsbuchedelajungle")
	public static final Block block = null;
	public BlockBitsBucheDeLaJungle(ElementsBitsBlock instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("bitsbuchedelajungle"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0,
				new ModelResourceLocation("bitsblock:bitsbuchedelajungle", "inventory"));
	}
	public static class BlockCustom extends Block {
		public BlockCustom() {
			super(Material.WOOD);
			setUnlocalizedName("bitsbuchedelajungle");
			setSoundType(SoundType.WOOD);
			setHardness(1F);
			setResistance(10F);
			setLightLevel(0F);
			setLightOpacity(255);
			setCreativeTab(TabBitsBlock.tab);
		}
	}
}
