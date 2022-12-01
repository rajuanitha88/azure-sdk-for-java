// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.MetadataItem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class MetadataItemTests {
    @Test
    public void testDeserialize() {
        MetadataItem model =
            BinaryData
                .fromString("{\"name\":\"ouyftaakc\",\"value\":\"wiyzvqtmnubexkp\"}")
                .toObject(MetadataItem.class);
        Assertions.assertEquals("ouyftaakc", model.name());
        Assertions.assertEquals("wiyzvqtmnubexkp", model.value());
    }

    @Test
    public void testSerialize() {
        MetadataItem model = new MetadataItem().withName("ouyftaakc").withValue("wiyzvqtmnubexkp");
        model = BinaryData.fromObject(model).toObject(MetadataItem.class);
        Assertions.assertEquals("ouyftaakc", model.name());
        Assertions.assertEquals("wiyzvqtmnubexkp", model.value());
    }
}