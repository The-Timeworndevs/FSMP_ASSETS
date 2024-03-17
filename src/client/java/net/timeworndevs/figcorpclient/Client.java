package net.timeworndevs.figcorpclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.timeworndevs.figcorpmain.common.CommonBlockRegistry;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class Client implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		List<@NotNull Block> translucentBlocks = new ArrayList<>(4);
		translucentBlocks.add(CommonBlockRegistry.SRF_BLAST_DOOR);
		if (CommonBlockRegistry.TALL_SRF_BLAST_DOOR != null)
			translucentBlocks.add(CommonBlockRegistry.TALL_SRF_BLAST_DOOR);
		translucentBlocks.add(CommonBlockRegistry.SRF_DOOR);
		if (CommonBlockRegistry.TALL_SRF_DOOR != null)
			translucentBlocks.add(CommonBlockRegistry.TALL_SRF_DOOR);
		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getTranslucent(), CommonBlockRegistry.SRF_BLAST_DOOR, CommonBlockRegistry.TALL_SRF_BLAST_DOOR, CommonBlockRegistry.SRF_DOOR, CommonBlockRegistry.TALL_SRF_DOOR);
	}
}