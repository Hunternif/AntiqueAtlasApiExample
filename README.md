AntiqueAtlasApiExample
======================

This mod serves as an example of using AntiqueAtlas API. For a complete description of the API see https://github.com/Hunternif/AntiqueAtlas/wiki/API and JavaDocs.

What this mod does, is every time the player right-clicks on a block, a "test" tile is put in the Atlas. The AntiqueAtlas mod itself is a "soft" dependency (as configured in mcmod.info), meaning that this example mod will not crash if the API is not present.

Building
--------

1. Check out the project and import it into a workspace with the project Minecraft.
2. Create a copy of the file `local.properties.example`, rename it to `local.properties` (Git ignores it) and change the properties to valid paths on your computer. The paths are either absolute or relative to the project folder.
3. Run the Ant script `build.xml`. By default it will create a release build, deobfuscated build and a zip file with the JavaDocs. Creation of JavaDocs will fail unless you run Ant in a JDK (instead of a simple JRE), but it will not affect the release builds.
