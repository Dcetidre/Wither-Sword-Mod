package com.software.ddk.wither_sword_mod.common.items;

import com.software.ddk.wither_sword_mod.material.ToolMaterialWither;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.Rarity;
import net.minecraft.world.World;

import java.util.List;

public class WitherSword extends SwordItem {

	public WitherSword(int attack_multiplier, float attack_speed) {
		super(ToolMaterialWither.TOOL_MATERIAL_WITHER, attack_multiplier, attack_speed, new Item.Settings()
                .maxCount(1)
                .group(ItemGroup.COMBAT)
                .rarity(Rarity.EPIC));
	}

	@Override
	public boolean postHit(ItemStack itemStack_1, LivingEntity livingEntity_1, LivingEntity livingEntity_2) {
	    super.postHit(itemStack_1, livingEntity_1, livingEntity_2);
	    livingEntity_1.addPotionEffect(new StatusEffectInstance(StatusEffects.WITHER, 250));
	    return true;
	}

	@Override
	public void appendTooltip(ItemStack itemStack_1, World world_1, List<Text> list_1, TooltipContext tooltipContext_1) {
		list_1.add(new TranslatableText("wither_sword_mod.wither_sword.tooltip",new LiteralText("Apply wither effect to enemies")));
		super.appendTooltip(itemStack_1, world_1, list_1, tooltipContext_1);
	}
}
