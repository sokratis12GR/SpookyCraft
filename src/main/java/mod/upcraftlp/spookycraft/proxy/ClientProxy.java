package mod.upcraftlp.spookycraft.proxy;

import mod.upcraftlp.spookycraft.client.renderer.RenderMirror;
import mod.upcraftlp.spookycraft.client.renderer.RenderScareCrow;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalBat;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalChicken;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalCow;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalLlama;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalLlamaSpit;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalOcelot;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalParrot;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalPig;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalRabbit;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalSheep;
import mod.upcraftlp.spookycraft.client.renderer.skeletals.RenderSkeletalWolf;
import mod.upcraftlp.spookycraft.entity.different.EntityMirror;
import mod.upcraftlp.spookycraft.entity.different.EntitySkeletalLlamaSpit;
import mod.upcraftlp.spookycraft.entity.monster.EntityScareCrow;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalBat;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalChicken;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalCow;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalLlama;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalOcelot;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalParrot;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalPig;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalRabbit;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalSheep;
import mod.upcraftlp.spookycraft.entity.monster.EntitySkeletalWolf;
import mod.upcraftlp.spookycraft.init.SpookyTabs;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * @author UpcraftLP <b>CLIENT-ONLY</b>
 */
@SideOnly(Side.CLIENT)
public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		SpookyTabs.SPOOKY_TAB.setIconStack(new ItemStack(Blocks.LIT_PUMPKIN)); // TODO
																				// different
																				// icon?
	}

	@Override
	public void init(FMLInitializationEvent event) {

		super.init(event);

		RenderManager rm = Minecraft.getMinecraft().getRenderManager();

		rm.entityRenderMap.put(EntityScareCrow.class, new RenderScareCrow(rm));
		rm.entityRenderMap.put(EntityMirror.class, new RenderMirror(rm));
		rm.entityRenderMap.put(EntitySkeletalBat.class, new RenderSkeletalBat(rm));
		rm.entityRenderMap.put(EntitySkeletalChicken.class, new RenderSkeletalChicken(rm));
		rm.entityRenderMap.put(EntitySkeletalCow.class, new RenderSkeletalCow(rm));
		rm.entityRenderMap.put(EntitySkeletalParrot.class, new RenderSkeletalParrot(rm));
		rm.entityRenderMap.put(EntitySkeletalPig.class, new RenderSkeletalPig(rm));
		rm.entityRenderMap.put(EntitySkeletalLlama.class, new RenderSkeletalLlama(rm));
		rm.entityRenderMap.put(EntitySkeletalWolf.class, new RenderSkeletalWolf(rm));
		rm.entityRenderMap.put(EntitySkeletalOcelot.class, new RenderSkeletalOcelot(rm));
		rm.entityRenderMap.put(EntitySkeletalSheep.class, new RenderSkeletalSheep(rm));
		rm.entityRenderMap.put(EntitySkeletalRabbit.class, new RenderSkeletalRabbit(rm));
		rm.entityRenderMap.put(EntitySkeletalLlamaSpit.class, new RenderSkeletalLlamaSpit(rm));
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}

	@Override
	public void serverStarting(FMLServerStartingEvent event) {
		super.serverStarting(event);
	}
}
