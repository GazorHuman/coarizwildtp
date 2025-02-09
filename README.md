A simple wild teleportation plugin that allows the players to random teleport in a specified world.

I created this plugin to create a more customizable plugin than what is available in the market. You can:
- edit the world your players teleport into
- edit the parameters
- edit the blocks the players can teleport
- edit the attempts (creates a more optimized outcomes for small servers)
- edit the center block of the specified world
  
## Dependencies
- **Vault (version 1.7.3)**
- **EssentialsX (Highly recommended) or any Economy plugin**

## Commands and Permissions
-  **/wild or /rtp** to randomly teleport
-  **coarizwildtp.use** (enabled by default)

## Recommendations
The use of [Chunky](https://modrinth.com/plugin/chunky) is highly recommended due to its performance boost alongside this plugin. It allows the chunks to pregenerate before a player teleports to the said area.

## Example config file:

```
#Plugin by Coariz
world: world

#Economy integration
cost: 0

#Parameters
max_x: 5000
max_z: 5000
min_x: -5000
min_z: -5000
spawn_radius: 500 # Change on how far the players should be teleported from spawn
center_x: 0 # X coordinate of the center point
center_z: 0 # Z coordinate of the center point
radius: 1000 # Radius around the center point for teleportation
max_attempts: 500 # Increased number of attempts
logging_enabled: false # Enable or disable logging
teleport_delay: 5 # Teleport delay in seconds
cooldown: 5 # Cooldown in seconds
allow_movement_during_delay: false # Allow or disallow movement during the delay

#Whitelisted and blacklisted blocks
blacklisted_blocks:
  - WATER
  - LAVA
  - FIRE
  - CACTUS
  - SWEET_BERRY_BUSH
  - BAMBOO
  - BAMBOO_SAPLING
allowed_surface_materials:
  - GRASS_BLOCK
  - DIRT
  - COARSE_DIRT
  - PATH
  - OAK_LEAVES
  - SPRUCE_LEAVES
  - BIRCH_LEAVES
  - JUNGLE_LEAVES
  - ACACIA_LEAVES
  - DARK_OAK_LEAVES
  - MANGROVE_LEAVES
  - AZALEA_LEAVES
  - FLOWERING_AZALEA_LEAVES
  - STONE
  - COBBLESTONE
  - OAK_LOG
  - SPRUCE_LOG
  - BIRCH_LOG
  - JUNGLE_LOG
  - ACACIA_LOG
  - DARK_OAK_LOG
  - MANGROVE_LOG
  - CRIMSON_STEM
  - WARPED_STEM
  - STRIPPED_OAK_LOG
  - STRIPPED_SPRUCE_LOG
  - STRIPPED_BIRCH_LOG
  - STRIPPED_JUNGLE_LOG
  - STRIPPED_ACACIA_LOG
  - STRIPPED_DARK_OAK_LOG
  - STRIPPED_MANGROVE_LOG
  - STRIPPED_CRIMSON_STEM
  - STRIPPED_WARPED_STEM
  - STRIPPED_OAK_WOOD
  - STRIPPED_SPRUCE_WOOD
  - STRIPPED_BIRCH_WOOD
  - STRIPPED_JUNGLE_WOOD
  - STRIPPED_ACACIA_WOOD
  - STRIPPED_DARK_OAK_WOOD
  - STRIPPED_MANGROVE_WOOD
  - STRIPPED_CRIMSON_HYPHAE
  - STRIPPED_WARPED_HYPHAE
```
## Test the plugin
play.azenhub.com

_The plugin doesn't have /reload feature to avoid bugs from happening_
