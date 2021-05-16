/*
    1010! Klooni, a free customizable puzzle game for Android and Desktop
    Copyright (C) 2017-2019  Lonami Exo @ lonami.dev

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package dev.lonami.klooni.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;

import dev.lonami.klooni.Klooni;

class DesktopLauncher {
    public static void main(String[] arg) {
        Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
        config.setTitle( "Klooni 1010!" );
        config.setWindowSizeLimits( Klooni.GAME_WIDTH, Klooni.GAME_HEIGHT, -1, -1 );
        config.setFullscreenMode( config.getDisplayMode() );
//         config.addIcon("ic_launcher/icon128.png", Files.FileType.Internal);
//         config.addIcon("ic_launcher/icon32.png", Files.FileType.Internal);
//         config.addIcon("ic_launcher/icon16.png", Files.FileType.Internal);
        new Lwjgl3Application(new Klooni(null), config);
    }
}
