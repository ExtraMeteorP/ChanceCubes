package chanceCubes;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import chanceCubes.blocks.CCubesBlocks;
import chanceCubes.config.CCubesSettings;
import chanceCubes.items.CCubesItems;
import cpw.mods.fml.common.registry.GameRegistry;

public class CraftingRecipies
{

	public static void loadRecipies()
	{
		if(CCubesSettings.craftingRecipie)
			GameRegistry.addShapedRecipe(new ItemStack(CCubesBlocks.chanceCube, 1), "LLL", "LBL", "LLL", 'B', new ItemStack(Blocks.lapis_block), 'L', new ItemStack(Items.dye, 1, 4));

		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.chancePendantT1, 1), "LBL", "BGB", "LBL", 'G', new ItemStack(Blocks.gold_block), 'B', new ItemStack(Blocks.lapis_block), 'L', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.chancePendantT2, 1), "LBL", "BPB", "LBL", 'P', new ItemStack(CCubesItems.chancePendantT1), 'B', new ItemStack(Blocks.lapis_block), 'L', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.chancePendantT3, 1), "LBL", "BPB", "LBL", 'P', new ItemStack(CCubesItems.chancePendantT2), 'B', new ItemStack(Blocks.lapis_block), 'L', new ItemStack(Items.dye, 1, 4));
		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.chancePendantT4, 1), "LBL", "BPB", "LBL", 'P', new ItemStack(CCubesItems.chancePendantT3), 'B', new ItemStack(Blocks.lapis_block), 'L', new ItemStack(Items.dye, 1, 4));

		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.silkPendant, 1), "SBS", "SPS", "SBS", 'P', new ItemStack(CCubesItems.chancePendantT2), 'B', new ItemStack(Blocks.lapis_block), 'S', new ItemStack(Items.string));

		GameRegistry.addShapedRecipe(new ItemStack(CCubesItems.scanner, 1), "IGI", "GPG", "IGI", 'P', new ItemStack(CCubesItems.chancePendantT2), 'G', new ItemStack(Blocks.glass), 'I', new ItemStack(Items.iron_ingot));
	}
}
