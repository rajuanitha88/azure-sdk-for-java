// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.EventListenerEndpoint;
import org.junit.jupiter.api.Test;

public final class EventListenerEndpointTests {
    @Test
    public void testDeserialize() {
        EventListenerEndpoint model =
            BinaryData.fromString("{\"type\":\"EventListenerEndpoint\"}").toObject(EventListenerEndpoint.class);
    }

    @Test
    public void testSerialize() {
        EventListenerEndpoint model = new EventListenerEndpoint();
        model = BinaryData.fromObject(model).toObject(EventListenerEndpoint.class);
    }
}