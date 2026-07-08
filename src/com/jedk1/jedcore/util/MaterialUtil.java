package com.jedk1.jedcore.util;

import com.projectkorra.projectkorra.GeneralMethods;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.Block;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaterialUtil {

    // todo: use the registry/tags (with config) or grab directly from PKs config maybe?
    private static final List<Material> TRANSPARENT_MATERIALS = new ArrayList<>() {{
        addAll(Arrays.asList(
                Material.AIR, Material.VOID_AIR, Material.CAVE_AIR, Material.ACACIA_SAPLING, Material.AZALEA, Material.OAK_SAPLING, Material.CHERRY_SAPLING,
                Material.SPRUCE_SAPLING, Material.BIRCH_SAPLING, Material.FLOWERING_AZALEA, Material.MANGROVE_PROPAGULE, Material.PALE_OAK_SAPLING,
                Material.JUNGLE_SAPLING, Material.DARK_OAK_SAPLING, Material.WATER,
                Material.LAVA, Material.COBWEB, Material.TALL_GRASS, Material.SHORT_GRASS, Material.FERN, Material.DEAD_BUSH,
                Material.DANDELION, Material.POPPY, Material.BLUE_ORCHID, Material.ALLIUM,
                Material.AZURE_BLUET, Material.RED_TULIP, Material.ORANGE_TULIP, Material.WHITE_TULIP, Material.PINK_TULIP,
                Material.OXEYE_DAISY, Material.BROWN_MUSHROOM, Material.RED_MUSHROOM, Material.TORCH, Material.FIRE,
                Material.WHEAT, Material.SNOW, Material.SUGAR_CANE, Material.VINE, Material.SUNFLOWER, Material.LILAC,
                Material.LARGE_FERN, Material.ROSE_BUSH, Material.PEONY,
                Material.ATTACHED_MELON_STEM, Material.ATTACHED_PUMPKIN_STEM, Material.BAMBOO_SAPLING, Material.BEETROOTS,
                Material.BIG_DRIPLEAF, Material.BIG_DRIPLEAF_STEM, Material.BUSH, Material.CACTUS_FLOWER, Material.CARROTS,
                Material.CAVE_VINES, Material.CAVE_VINES_PLANT, Material.CHORUS_FLOWER, Material.CLOSED_EYEBLOSSOM,
                Material.COCOA, Material.COMPARATOR, Material.COPPER_GOLEM_STATUE, Material.COPPER_TORCH,
                Material.COPPER_WALL_TORCH, Material.CORNFLOWER, Material.CRIMSON_FUNGUS, Material.CRIMSON_ROOTS,
                Material.DRAGON_WALL_HEAD, Material.END_ROD, Material.EXPOSED_COPPER_GOLEM_STATUE, Material.FIREFLY_BUSH,
                Material.FROGSPAWN, Material.GLOW_LICHEN, Material.GOLDEN_DANDELION, Material.HANGING_ROOTS,
                Material.KELP, Material.KELP_PLANT, Material.LEAF_LITTER, Material.LEVER, Material.LILY_OF_THE_VALLEY,
                Material.LILY_PAD, Material.MELON_STEM, Material.MOSS_CARPET, Material.NETHER_SPROUTS, Material.NETHER_WART,
                Material.OPEN_EYEBLOSSOM, Material.OXIDIZED_COPPER_GOLEM_STATUE, Material.PALE_HANGING_MOSS,
                Material.PALE_MOSS_CARPET, Material.PINK_PETALS, Material.PITCHER_CROP, Material.PITCHER_PLANT,
                Material.PLAYER_WALL_HEAD, Material.POTATOES, Material.POWDER_SNOW, Material.PUMPKIN_STEM,
                Material.REDSTONE_TORCH, Material.REDSTONE_WALL_TORCH, Material.REDSTONE_WIRE,
                Material.REPEATER, Material.RESIN_CLUMP, Material.SCAFFOLDING, Material.SEA_PICKLE, Material.SEAGRASS,
                Material.SHORT_DRY_GRASS, Material.SMALL_DRIPLEAF, Material.SOUL_TORCH,
                Material.SOUL_WALL_TORCH, Material.SPORE_BLOSSOM, Material.SWEET_BERRY_BUSH, Material.TALL_DRY_GRASS,
                Material.TALL_SEAGRASS, Material.TORCHFLOWER, Material.TORCHFLOWER_CROP, Material.TRIPWIRE,
                Material.TRIPWIRE_HOOK, Material.TWISTING_VINES, Material.TWISTING_VINES_PLANT, Material.WALL_TORCH,
                Material.WARPED_FUNGUS, Material.WARPED_ROOTS, Material.WAXED_COPPER_GOLEM_STATUE,
                Material.WAXED_EXPOSED_COPPER_GOLEM_STATUE, Material.WAXED_OXIDIZED_COPPER_GOLEM_STATUE,
                Material.WAXED_WEATHERED_COPPER_GOLEM_STATUE, Material.WEATHERED_COPPER_GOLEM_STATUE,
                Material.WEEPING_VINES, Material.WEEPING_VINES_PLANT, Material.WILDFLOWERS, Material.WITHER_ROSE));
        if (GeneralMethods.getMCVersion() >= 1170) {
            add(Material.getMaterial("LIGHT"));
        }
    }};
    public static boolean isSign(Material material) {
        return Tag.SIGNS.isTagged(material);
    }

    public static boolean isSign(Block block) {
        return isSign(block.getType());
    }

    // Do a fast lookup by avoiding the region protection check.
    public static boolean isTransparent(Block block) {
        return isTransparent(block.getType());
    }

    // Do a fast lookup by avoiding the region protection check.
    public static boolean isTransparent(Material material) {
        return TRANSPARENT_MATERIALS.contains(material);
    }
}
