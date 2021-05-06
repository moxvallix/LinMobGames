# LinMobGames
Games for Linux Mobile

This repository holds the code for all of the games that have been patched to run on Linux aarch64.
All of them will run on the PinePhone, and probably the Librem 5 (which I can't test as I don't have one)

Binaries are under bin/, and the modified sources are under src/.

## List of games in this repo:
### Shattered Pixel Dungeon: A roguelike pixelated RPG.
- Run in java
- Pinch-to-zoom was broken by my patches, but otherwise works perfectly. 
- Set the game to full-screen for best effect. 
- Only way to quit game on Plasma Mobile is from the pause menu.

### PixelWheels: A top-down arcade style racer.
- Run in java.
- Game seems to run without bugs. Slight UI issues in menus however.
- Best in fullscreen mode, and landscape screen rotation.
- Enable touch UI in: Settings > Misc > Developer Options > Misc, then set "Force touch input" to true.
- Change to touch UI in: Settings > Input, and set both controllers to Pie or Side buttons.
- Only way to quit game on Plasma Mobile is from the game menu.
