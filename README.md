# Fabric Example Mod

## Setup

For setup instructions please see the [fabric wiki page](https://fabricmc.net/wiki/tutorial:setup) that relates to the IDE that you are using.

## License

This template is available under the CC0 license. Feel free to learn from it and incorporate it in your own projects.

## Development

Add remap=false to mixin annotation because there has no obfuscation in velocity.

Example:
```java
package com.example.mixin;

import com.velocitypowered.proxy.VelocityServer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = VelocityServer.class, remap = false)
public class ExampleMixin {
}
```

### Launch

**Do not use the gradle task provided by fabric-loom `runClient` or `runServer`**

**DevLaunch Does Not Work!**

- Download a release from [fabric-loader-velocity/release](https://github.com/ZhuRuoLing/fabric-loader-velocity/releases)
- Put your mod build files into mods directory
- Launch

## Build

Just use `build` task to build your mod.

**Reminder: You may use shadowJar plugin to exclude or relocate some library classes because they might be shadowed into velocity jar.**