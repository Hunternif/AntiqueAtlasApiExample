AntiqueAtlasApiExample
======================

This mod serves as an example of using AntiqueAtlas API. For a complete description of the API see https://github.com/Hunternif/AntiqueAtlas/wiki/API and JavaDocs.

What this mod does, is every time the player right-clicks on a block, a "test" tile is put in the Atlas. The AntiqueAtlas mod itself is a "soft" dependency (as configured in mcmod.info), meaning that this example mod will not crash if the API is not present.

Building
--------

See the general instructions for installing Forge Gradle at https://github.com/MinecraftForge/MinecraftForge

In order to build the mod run `./gradlew build`, the resulting jar file will be found in the folder `build/libs`.