/*
 * Look4Sat. Amateur radio satellite tracker and pass predictor.
 * Copyright (C) 2019-2022 Arty Bishop (bishop.arty@gmail.com)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package com.rtbishop.look4sat.domain

import com.rtbishop.look4sat.model.GeoPos
import kotlinx.coroutines.flow.StateFlow

interface ILocationSource {

    val stationPosition: StateFlow<GeoPos>

    fun setGpsPosition(): Boolean

    fun setGeoPosition(latitude: Double, longitude: Double, altitude: Double = 0.0): Boolean

    fun setQthPosition(locator: String): Boolean
}
