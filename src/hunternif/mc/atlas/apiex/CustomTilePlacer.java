package hunternif.mc.atlas.apiex;

import hunternif.mc.atlas.api.AtlasAPI;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

/**
 * Whenever the player right-clicks a block, a custom tile will be put in the
 * Atlas at that chunk.
 * @author Hunternif
 */
public class CustomTilePlacer {
	public static final String customTileName = "testCustomTile";
	
	@ForgeSubscribe
	public void onPlayerRightClickBlock(PlayerInteractEvent event) {
		if (!event.entity.worldObj.isRemote && event.action == Action.RIGHT_CLICK_BLOCK) {
			AtlasAPI.getTileAPI().putCustomTile(event.entity.worldObj, event.entity.dimension,
					customTileName, event.x >> 4, event.z >> 4);
		}
	}
	
	public static void registerTextures() {
		AtlasAPI.getTileAPI().setTextureIfNone(customTileName,
				new ResourceLocation(AtlasApiExampleMod.ID, "textures/test.png"));
	}
}
