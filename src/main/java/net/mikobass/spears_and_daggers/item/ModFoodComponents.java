package net.mikobass.spears_and_daggers.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent NOXBERRIES = new FoodComponent.Builder().hunger(5).saturationModifier(0.8f).statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 1200), 1f).build();
}
