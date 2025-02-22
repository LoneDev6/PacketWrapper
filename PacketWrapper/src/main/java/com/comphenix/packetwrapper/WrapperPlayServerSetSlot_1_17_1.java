/**
 * PacketWrapper - ProtocolLib wrappers for Minecraft packets
 * Copyright (C) dmulloy2 <http://dmulloy2.net>
 * Copyright (C) Kristian S. Strangeland
 * <p>
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comphenix.packetwrapper;

public class WrapperPlayServerSetSlot_1_17_1 extends WrapperPlayServerSetSlot
{
    /**
     * Retrieve Slot.
     * <p>
     * Notes: the slot that should be updated
     *
     * @return The current Slot
     */
    public int getSlot()
    {
        return handle.getIntegers().read(2);
    }

    /**
     * Set Slot.
     *
     * @param value - new value.
     */
    public void setSlot(int value)
    {
        handle.getIntegers().write(2, value);
    }
}