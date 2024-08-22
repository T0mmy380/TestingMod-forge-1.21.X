package net.endom.testingmod.item;

import net.endom.testingmod.TestingMod;
import net.endom.testingmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TestingMod.MOD_ID);


    public static final RegistryObject<CreativeModeTab> TESTING_TAB = CREATIVE_MODE_TABS.register("testing_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SCARLET_GOLD.get()))
                    .title(Component.translatable("creativetab.testingmod.testing"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SCARLET_GOLD.get());
                        output.accept(ModItems.SCARLET_SWORD.get());
                        output.accept(ModBlocks.SCARLET_GOLD_BLOCK.get());
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
