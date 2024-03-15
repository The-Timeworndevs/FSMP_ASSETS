package net.timeworndevs.figcorpmain.common;

import com.fizzware.dramaticdoors.fabric.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.fabric.blocks.TallDoorBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.timeworndevs.figcorpmain.init.FigCorpRegistry;

public class CommonBlockRegistry {

    public static Block SRF_LOGO;
    public static Block SRF_BLASTPLATE;
    public static Block SHORT_SRF_BLAST_DOOR;
    public static Block SRF_BLAST_DOOR;
    public static Block TALL_SRF_BLAST_DOOR;
    public static Block SRF_LOGO_QUARTZ;
    public static Block SHORT_SRF_DOOR;
    public static Block SRF_DOOR;
    public static Block TALL_SRF_DOOR;

    public static Block OBSOL_BLOCK;
    public static Block OBSOL_NEON;
    public static Block OBSOL_LOGO;

    public static Block EXPLOIT_LOGO;
    public static Block EXPLOIT_PLATING;
    public static Block EXPLOIT_IMMOBILE_PLATING;

    public static Block KMD_PLATING;
    public static Block KMD_HEAVY_PLATING;

    public static void register() {
        SRF_LOGO = FigCorpRegistry.register("srf_logo", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK)));
        SRF_BLASTPLATE = FigCorpRegistry.register("srf_plate", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK)));
        SHORT_SRF_BLAST_DOOR = FigCorpRegistry.register("short_srf_blast_door", new ShortDoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
        SRF_BLAST_DOOR = FigCorpRegistry.register("srf_blast_door", new DoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
        TALL_SRF_BLAST_DOOR = FigCorpRegistry.register("tall_srf_blast_door", new TallDoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.WHITE).pistonBehavior(PistonBehavior.BLOCK), BlockSetType.IRON));
        SRF_LOGO_QUARTZ = FigCorpRegistry.register("srf_logo_quartz", new GlazedTerracottaBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(0.8F,0.8F).requiresTool().mapColor(MapColor.OFF_WHITE)));
        SHORT_SRF_DOOR =FigCorpRegistry.register("short_srf_door", new ShortDoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).requiresTool().mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE));
        SRF_DOOR = FigCorpRegistry.register("srf_door", new DoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(5,5).requiresTool().mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE));
        TALL_SRF_DOOR = FigCorpRegistry.register("tall_srf_door", new TallDoorBlock(FabricBlockSettings.of().sounds(BlockSoundGroup.STONE).strength(5,5).mapColor(MapColor.OFF_WHITE).pistonBehavior(PistonBehavior.DESTROY), BlockSetType.STONE));

        OBSOL_BLOCK = FigCorpRegistry.register("obsol_block", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY)));
        OBSOL_NEON = FigCorpRegistry.register("obsol_neon", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY).luminance(15)));
        OBSOL_LOGO = FigCorpRegistry.register("obsol_logo", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.GRAY)));

        EXPLOIT_LOGO = FigCorpRegistry.register("exploit_logo", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50, 1200).requiresTool().mapColor(MapColor.MAGENTA)));
        EXPLOIT_PLATING = FigCorpRegistry.register("exploit_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.MAGENTA)));
        EXPLOIT_IMMOBILE_PLATING = FigCorpRegistry.register("exploit_immobile_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.MAGENTA).pistonBehavior(PistonBehavior.BLOCK)));

        KMD_PLATING = FigCorpRegistry.register("kmd_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TEAL)));
        KMD_HEAVY_PLATING = FigCorpRegistry.register("kmd_heavy_plating", new Block(FabricBlockSettings.of().sounds(BlockSoundGroup.NETHERITE).strength(50,1200).requiresTool().mapColor(MapColor.TEAL).pistonBehavior(PistonBehavior.BLOCK)));
    }
}
