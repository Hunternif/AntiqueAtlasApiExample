package hunternif.mc.atlas.apiex;

import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;

@Mod(modid=AtlasApiExampleMod.ID, name=AtlasApiExampleMod.NAME, version=AtlasApiExampleMod.VERSION)
public class AtlasApiExampleMod {
	public static final String ID = "antiqueatlasapiexample";
	public static final String NAME = "Antique Atlas API Example";
	public static final String VERSION = "@@MOD_VERSION@@";
	
	public static final String antiqueAtlasModID = "antiqueatlas";
	
	@SidedProxy(clientSide="hunternif.mc.atlas.apiex.ClientProxy", serverSide="hunternif.mc.atlas.apiex.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		if (Loader.isModLoaded(antiqueAtlasModID)) {
			MinecraftForge.EVENT_BUS.register(new CustomTilePlacer());
		}
	}
}
