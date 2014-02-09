package hunternif.mc.atlas.apiex;

import hunternif.mc.atlas.api.AtlasAPI;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.Action;

/**
 * Whenever the player right-clicks a block, a custom tile will be put in the
 * Atlas at that chunk.
 * @author Hunternif
 */
public class CustomTilePlacer {
	@ForgeSubscribe
	public void onPlayerRightClickBlock(PlayerInteractEvent event) {
		if (!event.entity.worldObj.isRemote && event.action == Action.RIGHT_CLICK_BLOCK) {
			AtlasAPI.getTileAPI().putCustomTile(event.entity.worldObj, event.entity.dimension,
					AtlasApiExampleMod.customTileName, event.x >> 4, event.z >> 4);
		}
	}
}
