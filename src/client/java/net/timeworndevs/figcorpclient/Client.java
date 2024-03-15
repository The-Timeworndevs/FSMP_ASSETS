package net.timeworndevs.figcorpclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.timeworndevs.figcorpmain.common.CommonBlockRegistry;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), CommonBlockRegistry.SRF_BLAST_DOOR, CommonBlockRegistry.TALL_SRF_BLAST_DOOR, CommonBlockRegistry.SRF_DOOR, CommonBlockRegistry.TALL_SRF_DOOR);
	}
}