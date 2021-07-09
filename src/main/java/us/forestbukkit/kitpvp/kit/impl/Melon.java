package us.forestbukkit.kitpvp.kit.impl;

import org.bukkit.Color;
import us.forestbukkit.kitpvp.kit.Kit;
import us.forestbukkit.kitpvp.utils.ItemBuilder;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Melon extends Kit {

    public Melon() {
        super("Melon", Material.WATER_BUCKET, new String[]{
                    "&7Take down your opponents with style",
                "&7and Melon..."
        }, 500);
    }

    @Override
    public ItemStack[] getItems() {
        return new ItemStack[]{
                new ItemBuilder(Material.MELON)
                        .enchantment(Enchantment.DAMAGE_ALL, 3)
                        .build(),
        };
    }

    @Override
    public ItemStack[] getArmor() {
        return new ItemStack[]{
                new ItemStack(Material.IRON_BOOTS),
                new ItemStack(Material.IRON_LEGGINGS),
                new ItemBuilder(Material.LEATHER_CHESTPLATE).color(Color.GREEN).enchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2).enchantment(Enchantment.DURABILITY, 3).build(),
                new ItemStack(Material.IRON_HELMET),
        };
    }

    @Override
    public ItemStack getAbilityItem() {
        return null;
    }

    @Override
    public PotionEffect[] getPotionEffects() {
        return new PotionEffect[]{
                new PotionEffect(PotionEffectType.SPEED, Integer.MAX_VALUE, 1),
                new PotionEffect(PotionEffectType.FIRE_RESISTANCE, Integer.MAX_VALUE, 0)
        };
    }
}
