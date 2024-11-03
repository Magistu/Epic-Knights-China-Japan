package com.chinajapanarmory.forge;

import com.chinajapanarmory.EpicKnightsChinaJapan;
import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(EpicKnightsChinaJapan.ID)
public class EpicKnightsChinaJapanForge
{
    public EpicKnightsChinaJapanForge()
    {
        EventBuses.registerModEventBus(EpicKnightsChinaJapan.ID, FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);

        EpicKnightsChinaJapan.init();
    }
}
