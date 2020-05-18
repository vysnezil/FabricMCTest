package sk.jurij.fabrictest.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;


@Mixin(TitleScreen.class)
public abstract class ExampleMixin {
	@Shadow
	private String splashText;


	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info){

		System.out.println("This line is printed by an example mod mixin!");
		this.splashText = "fabricTEstBoo";
	}

}
