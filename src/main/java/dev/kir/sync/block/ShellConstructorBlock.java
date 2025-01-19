package dev.kir.sync.block;

import com.mojang.serialization.MapCodec;
import dev.kir.sync.block.entity.ShellConstructorBlockEntity;
import net.minecraft.block.BlockState;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class ShellConstructorBlock extends AbstractShellContainerBlock {
    public ShellConstructorBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new ShellConstructorBlockEntity(pos, state);
    }
}
