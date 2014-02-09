package hunternif.mc.atlas.apiex;

import hunternif.mc.atlas.api.AtlasAPI;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		AtlasAPI.getTileAPI().setTextureIfNone(AtlasApiExampleMod.customTileName,
				new ResourceLocation(AtlasApiExampleMod.ID, "textures/test.png"));
	}
}
