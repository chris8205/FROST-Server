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
package de.fraunhofer.iosb.ilt.frostserver.json.deserialize.custom;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author scf
 */
public class CustomDeserializationManager {

    private static final Map<String, CustomDeserializer> customDeserializers = new HashMap<>();

    private CustomDeserializationManager() {
        // Not for instantiation.
    }

    public static void registerDeserializer(String encodingType, CustomDeserializer deserializer) {
        customDeserializers.put(encodingType, deserializer);
    }

    public static CustomDeserializer getDeserializer(String encodingType) {
        CustomDeserializer result = null;
        if (customDeserializers.containsKey(encodingType)) {
            result = customDeserializers.get(encodingType);
        }
        if (result == null) {
            result = new DefaultDeserializer();
        }
        return result;
    }

}
