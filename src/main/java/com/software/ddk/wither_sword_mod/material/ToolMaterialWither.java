package com.software.ddk.wither_sword_mod.material;

import com.software.ddk.wither_sword_mod.WitherSwordMod;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ToolMaterialWither implements ToolMaterial{
	private int durability;
	private float miningSpeed;
	private float attackDamage;
	private int miningLevel;
	private int enchantability;
	private Ingredient repairIngredient;

	public static ToolMaterial TOOL_MATERIAL_WITHER = new ToolMaterialWither(1200, 8.0F, 3.0F, 3, 10, Ingredient.ofItems(Items.WITHER_SKELETON_SKULL));

	public ToolMaterialWither(int durability, float miningSpeed, float attackDamage, int miningLevel, int enchantability, Ingredient ingredient){
		this.durability = durability;
		this.miningSpeed = miningSpeed;
		this.attackDamage = attackDamage;
		this.miningLevel = miningLevel;
		this.enchantability = enchantability;
		this.repairIngredient = ingredient;
	}

	@Override
	public int getDurability() {
		return 1200; //1561
	}

	@Override
	public float getMiningSpeed() {
		return 8.0f;
	}

	@Override
	public float getAttackDamage() {
		return 3.0f;
	}

	@Override
	public int getMiningLevel() {
		return 3;
	}

	@Override
	public int getEnchantability() {
		return 10;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return Ingredient.ofItems(Items.WITHER_SKELETON_SKULL);
	}

}
