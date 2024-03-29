package com.example.mixin;

import com.velocitypowered.proxy.VelocityServer;
import org.apache.logging.log4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;


//remember to add remap=false to annotation because there has no obfuscation in velocity
@Mixin(value = VelocityServer.class, remap = false)
public class ExampleMixin {
	@Shadow @Final private static Logger logger;

	@Inject(method = "start", at = @At("HEAD"))
	void onVelocityStart(CallbackInfo ci){
		logger.info("Hello from Mixin!");
	}
}