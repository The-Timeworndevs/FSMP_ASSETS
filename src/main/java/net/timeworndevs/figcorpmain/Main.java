package net.timeworndevs.figcorpmain;

import net.fabricmc.api.ModInitializer;

import net.timeworndevs.figcorpmain.common.CommonBlockRegistry;
import net.timeworndevs.figcorpmain.common.CommonItemRegistry;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MODID = "figcorp";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {

		LOGGER.info("Figcorp Registering...");

		CommonBlockRegistry.register();
		CommonItemRegistry.register();

		LOGGER.info("Figcorp Registered!");
	}

	public static @Nullable Class tryLink(String className) {
		try {
			return Main.class.getClassLoader().loadClass(className);
		} catch (ClassNotFoundException e) {
			return null;
		}
	}
}