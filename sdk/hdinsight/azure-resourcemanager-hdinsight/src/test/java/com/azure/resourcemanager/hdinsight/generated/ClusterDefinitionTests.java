// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.models.ClusterDefinition;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ClusterDefinitionTests {
    @Test
    public void testDeserialize() {
        ClusterDefinition model =
            BinaryData
                .fromString(
                    "{\"blueprint\":\"audccsnhs\",\"kind\":\"nyejhkryhtnap\",\"componentVersion\":{\"ni\":\"lokjyemkk\",\"ilzyd\":\"joxzjnchgejspodm\"},\"configurations\":\"datao\"}")
                .toObject(ClusterDefinition.class);
        Assertions.assertEquals("audccsnhs", model.blueprint());
        Assertions.assertEquals("nyejhkryhtnap", model.kind());
        Assertions.assertEquals("lokjyemkk", model.componentVersion().get("ni"));
    }

    @Test
    public void testSerialize() {
        ClusterDefinition model =
            new ClusterDefinition()
                .withBlueprint("audccsnhs")
                .withKind("nyejhkryhtnap")
                .withComponentVersion(mapOf("ni", "lokjyemkk", "ilzyd", "joxzjnchgejspodm"))
                .withConfigurations("datao");
        model = BinaryData.fromObject(model).toObject(ClusterDefinition.class);
        Assertions.assertEquals("audccsnhs", model.blueprint());
        Assertions.assertEquals("nyejhkryhtnap", model.kind());
        Assertions.assertEquals("lokjyemkk", model.componentVersion().get("ni"));
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}