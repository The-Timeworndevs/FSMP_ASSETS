package net.timeworndevs.figcorpmain;

import net.fabricmc.api.ModInitializer;

import net.timeworndevs.figcorpmain.common.CommonBlockRegistry;
import net.timeworndevs.figcorpmain.common.CommonItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MODID = "figcorp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric world!");

		CommonBlockRegistry.register();
		CommonItemRegistry.register();
	}
}