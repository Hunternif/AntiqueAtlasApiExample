package hunternif.mc.atlas.apiex;

import hunternif.mc.atlas.api.AtlasAPI;
import hunternif.mc.atlas.api.TileAPI;
import hunternif.mc.atlas.client.TextureSet;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;

/**
 * Whenever the player right-clicks a block, a custom tile will be put in the
 * Atlas at that chunk.
 * @author Hunternif
 */
public class CustomTilePlacer {
	public static final String customTileName = "testCustomTile";
	
	@SubscribeEvent
	public void onPlayerRightClickBlock(PlayerInteractEvent event) {
		if (!event.entity.worldObj.isRemote && event.action == Action.RIGHT_CLICK_BLOCK) {
			AtlasAPI.getTileAPI().putCustomGlobalTile(event.entity.worldObj,
					customTileName, event.x >> 4, event.z >> 4);
		}
	}
	
	public static void registerTextures() {
		TileAPI api = AtlasAPI.getTileAPI();
		TextureSet textureSet = api.registerTextureSet("My test texture set",
				new ResourceLocation(AtlasApiExampleMod.ID, "textures/test.png"));
		api.setCustomTileTexture(customTileName, textureSet);
	}
}
