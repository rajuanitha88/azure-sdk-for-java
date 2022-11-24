// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResource;
import com.azure.resourcemanager.cognitiveservices.models.PrivateLinkResourceProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateLinkResourceTests {
    @Test
    public void testDeserialize() {
        PrivateLinkResource model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"groupId\":\"ongmtsa\",\"requiredMembers\":[\"bp\",\"xqpsrknftguv\",\"iuhprwmdyvxqta\",\"riwwroy\"],\"requiredZoneNames\":[\"xrmcqibycnojvk\",\"mefqsgzvahapjyzh\",\"vgqzcjrvxd\",\"zlmwlxkvugfhz\"],\"displayName\":\"awjvzunluthnnp\"},\"id\":\"nxipeil\",\"name\":\"jzuaejxdultskzbb\",\"type\":\"dzumveekg\"}")
                .toObject(PrivateLinkResource.class);
        Assertions.assertEquals("xrmcqibycnojvk", model.properties().requiredZoneNames().get(0));
    }

    @Test
    public void testSerialize() {
        PrivateLinkResource model =
            new PrivateLinkResource()
                .withProperties(
                    new PrivateLinkResourceProperties()
                        .withRequiredZoneNames(
                            Arrays.asList("xrmcqibycnojvk", "mefqsgzvahapjyzh", "vgqzcjrvxd", "zlmwlxkvugfhz")));
        model = BinaryData.fromObject(model).toObject(PrivateLinkResource.class);
        Assertions.assertEquals("xrmcqibycnojvk", model.properties().requiredZoneNames().get(0));
    }
}