package com.software.ddk.wither_sword_mod;

import com.software.ddk.wither_sword_mod.common.items.WitherSword;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class WitherSwordMod implements ModInitializer {
    public static final String MOD_ID = "wither_sword_mod";

    @Override
    public void onInitialize() {
        System.out.println("Wither Sword Mod Loading");
        //register sword
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "wither_sword"), new WitherSword(4, -1.9f));
    }
}
