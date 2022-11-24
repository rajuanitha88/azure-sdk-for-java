// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.fluent.models.OperationInner;
import com.azure.resourcemanager.cognitiveservices.models.OperationDisplay;
import org.junit.jupiter.api.Test;

public final class OperationInnerTests {
    @Test
    public void testDeserialize() {
        OperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"ynhijggme\",\"isDataAction\":true,\"display\":{\"provider\":\"rbu\",\"resource\":\"cvpnazzmhjrunmpx\",\"operation\":\"dbhrbnlankxm\",\"description\":\"k\"},\"origin\":\"user,system\",\"actionType\":\"Internal\"}")
                .toObject(OperationInner.class);
    }

    @Test
    public void testSerialize() {
        OperationInner model = new OperationInner().withDisplay(new OperationDisplay());
        model = BinaryData.fromObject(model).toObject(OperationInner.class);
    }
}