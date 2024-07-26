package net.mrbeelo.rubycollection.addons.providers;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.mrbeelo.rubycollection.addons.modaddons.ModItems;
import net.mrbeelo.rubycollection.addons.modaddons.ModTags;

import java.util.concurrent.CompletableFuture;

public class ItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS).add(ModItems.RUBY_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES).add(ModItems.RUBY_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES).add(ModItems.RUBY_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS).add(ModItems.RUBY_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES).add(ModItems.RUBY_HOE);

        getOrCreateTagBuilder(ModTags.Items.RUBY_TOOLS)
                .add(ModItems.RUBY_SWORD)
                .add(ModItems.RUBY_PICKAXE)
                .add(ModItems.RUBY_AXE)
                .add(ModItems.RUBY_SHOVEL)
                .add(ModItems.RUBY_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR).add(ModItems.RUBY_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR).add(ModItems.RUBY_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR).add(ModItems.RUBY_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR).add(ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.RUBY_ARMOR)
                .add(ModItems.RUBY_HELMET)
                .add(ModItems.RUBY_CHESTPLATE)
                .add(ModItems.RUBY_LEGGINGS)
                .add(ModItems.RUBY_BOOTS);

        getOrCreateTagBuilder(ModTags.Items.RUBY_VARIANTS)
                .add(ModItems.RUBY_SHARD)
                .add(ModItems.RUBY)
                .add(ModItems.RUBY_INGOT)
                .add(ModItems.RUBY_CLUSTER);

        getOrCreateTagBuilder(ModTags.Items.RUBY_ITEMS)
                .addTag(ModTags.Items.RUBY_TOOLS)
                .addTag(ModTags.Items.RUBY_ARMOR)
                .addTag(ModTags.Items.RUBY_VARIANTS);

        getOrCreateTagBuilder(ItemTags.BEACON_PAYMENT_ITEMS)
                .addTag(ModTags.Items.RUBY_VARIANTS);
    }
}
