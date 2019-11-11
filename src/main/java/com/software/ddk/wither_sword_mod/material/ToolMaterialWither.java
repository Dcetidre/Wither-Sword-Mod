package com.software.ddk.wither_sword_mod.material;

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
		return durability; //1561
	}

	@Override
	public float getMiningSpeed() {
		return miningSpeed;
	}

	@Override
	public float getAttackDamage() {
		return attackDamage;
	}

	@Override
	public int getMiningLevel() {
		return miningLevel;
	}

	@Override
	public int getEnchantability() {
		return enchantability;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairIngredient;
	}

}
