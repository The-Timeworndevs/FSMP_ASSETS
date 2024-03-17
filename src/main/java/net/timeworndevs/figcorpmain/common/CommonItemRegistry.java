package net.timeworndevs.figcorpmain.common;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.timeworndevs.figcorpmain.init.FigCorpRegistry;

public class CommonItemRegistry {

    public static BlockItem SRF_LOGO;
    public static BlockItem SRF_BLASTPLATE;
    public static BlockItem SHORT_SRF_BLAST_DOOR;
    public static BlockItem SRF_BLAST_DOOR;
    public static BlockItem TALL_SRF_BLAST_DOOR;
    public static BlockItem SRF_LOGO_QUARTZ;
    public static BlockItem SHORT_SRF_DOOR;
    public static BlockItem SRF_DOOR;
    public static BlockItem TALL_SRF_DOOR;

    public static BlockItem OBSOL_BLOCK;
    public static BlockItem OBSOL_NEON;
    public static BlockItem OBSOL_LOGO;

    public static BlockItem EXPLOIT_LOGO;
    public static BlockItem EXPLOIT_PLATING;
    public static BlockItem EXPLOIT_IMMOBILE_PLATING;

    public static BlockItem KMD_PLATING;
    public static BlockItem KMD_HEAVY_PLATING;

    public static BlockItem TEST_SLIDING_DOOR;

    public static void register() {
        SRF_LOGO = FigCorpRegistry.register("srf_logo", new BlockItem(CommonBlockRegistry.SRF_LOGO, new Item.Settings()));
        SRF_BLASTPLATE = FigCorpRegistry.register("srf_plate", new BlockItem(CommonBlockRegistry.SRF_BLASTPLATE, new Item.Settings()));
        SHORT_SRF_BLAST_DOOR = FigCorpRegistry.register("short_srf_blast_door", new BlockItem(CommonBlockRegistry.SHORT_SRF_BLAST_DOOR, new Item.Settings()));
        SRF_BLAST_DOOR = FigCorpRegistry.register("srf_blast_door", new BlockItem(CommonBlockRegistry.SRF_BLAST_DOOR, new Item.Settings()));
        TALL_SRF_BLAST_DOOR = FigCorpRegistry.register("tall_srf_blast_door", new BlockItem(CommonBlockRegistry.TALL_SRF_BLAST_DOOR, new Item.Settings()));
        SRF_LOGO_QUARTZ = FigCorpRegistry.register("srf_logo_quartz", new BlockItem(CommonBlockRegistry.SRF_LOGO_QUARTZ, new Item.Settings()));
        SHORT_SRF_DOOR = FigCorpRegistry.register("short_srf_door", new BlockItem(CommonBlockRegistry.SHORT_SRF_DOOR, new Item.Settings()));
        SRF_DOOR = FigCorpRegistry.register("srf_door", new BlockItem(CommonBlockRegistry.SRF_DOOR, new Item.Settings()));
        TALL_SRF_DOOR = FigCorpRegistry.register("tall_srf_door", new BlockItem(CommonBlockRegistry.TALL_SRF_DOOR, new Item.Settings()));

        OBSOL_BLOCK = FigCorpRegistry.register("obsol_block", new BlockItem(CommonBlockRegistry.OBSOL_BLOCK, new Item.Settings()));
        OBSOL_NEON = FigCorpRegistry.register("obsol_neon", new BlockItem(CommonBlockRegistry.OBSOL_NEON, new Item.Settings()));
        OBSOL_LOGO = FigCorpRegistry.register("obsol_logo", new BlockItem(CommonBlockRegistry.OBSOL_LOGO, new Item.Settings()));

        EXPLOIT_LOGO = FigCorpRegistry.register("exploit_logo", new BlockItem(CommonBlockRegistry.EXPLOIT_LOGO, new Item.Settings()));
        EXPLOIT_PLATING = FigCorpRegistry.register("exploit_plating", new BlockItem(CommonBlockRegistry.EXPLOIT_PLATING, new Item.Settings()));
        EXPLOIT_IMMOBILE_PLATING = FigCorpRegistry.register("exploit_immobile_plating", new BlockItem(CommonBlockRegistry.EXPLOIT_IMMOBILE_PLATING, new Item.Settings()));

        KMD_PLATING = FigCorpRegistry.register("kmd_plating", new BlockItem(CommonBlockRegistry.KMD_PLATING, new Item.Settings()));
        KMD_HEAVY_PLATING = FigCorpRegistry.register("kmd_heavy_plating", new BlockItem(CommonBlockRegistry.KMD_HEAVY_PLATING, new Item.Settings()));

        TEST_SLIDING_DOOR = FigCorpRegistry.register("test_sliding_door", new BlockItem(CommonBlockRegistry.TEST_SLIDING_DOOR, new Item.Settings()));

        addGroups();
    }

    public static void addGroups(){
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SRF_LOGO);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SRF_BLASTPLATE);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SHORT_SRF_BLAST_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SRF_BLAST_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(TALL_SRF_BLAST_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SRF_LOGO_QUARTZ);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SHORT_SRF_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(SRF_DOOR);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(TALL_SRF_DOOR);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(OBSOL_BLOCK);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(OBSOL_NEON);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(OBSOL_LOGO);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(EXPLOIT_LOGO);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(EXPLOIT_PLATING);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(EXPLOIT_IMMOBILE_PLATING);});

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(KMD_PLATING);});
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(KMD_HEAVY_PLATING);});

    }
}
