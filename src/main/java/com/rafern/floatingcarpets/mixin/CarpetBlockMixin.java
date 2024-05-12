package com.rafern.floatingcarpets.mixin;

import net.minecraft.block.BlockState;
import net.minecraft.block.CarpetBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(CarpetBlock.class)
public class CarpetBlockMixin {
    /**
     * @author rafern
     * @reason Lets you place carpets mid-air
     */
    @Overwrite
	public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		return true;
	}
}
