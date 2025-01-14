/*
 * Copyright (C) 2024 Fraunhofer Institut IOSB, Fraunhoferstr. 1, D 76131
 * Karlsruhe, Germany.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.fraunhofer.iosb.ilt.frostserver.settings;

/**
 * Thrown when a non-existing property is requested without a default value.
 */
public class PropertyMissingException extends PropertyException {

    public PropertyMissingException(String key, Throwable cause) {
        super("No configuration setting found for key '" + key + "'", cause);
    }

    public PropertyMissingException(String key) {
        this(key, null);
    }

    public PropertyMissingException(Throwable cause) {
        super(cause);
    }

}
