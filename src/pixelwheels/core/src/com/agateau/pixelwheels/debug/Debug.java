/*
 * Copyright 2017 Aurélien Gâteau <mail@agateau.com>
 *
 * This file is part of Pixel Wheels.
 *
 * Pixel Wheels is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.agateau.pixelwheels.debug;

/** Debug options */
public class Debug {
    public boolean showDebugHud = false;
    public boolean showDebugLayer = false;
    public boolean drawVelocities = false;
    public boolean drawTileCorners = false;
    public boolean showHudDebugLines = false;

    public boolean alwaysShowTouchInput = false;
    public boolean createSpeedReport = false;

    public int maxSkidmarks = 60;

    public static final Debug instance = new Debug();
}
