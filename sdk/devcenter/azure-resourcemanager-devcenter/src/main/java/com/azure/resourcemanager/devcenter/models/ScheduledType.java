// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScheduledType. */
public final class ScheduledType extends ExpandableStringEnum<ScheduledType> {
    /** Static value StopDevBox for ScheduledType. */
    public static final ScheduledType STOP_DEV_BOX = fromString("StopDevBox");

    /**
     * Creates or finds a ScheduledType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScheduledType.
     */
    @JsonCreator
    public static ScheduledType fromString(String name) {
        return fromString(name, ScheduledType.class);
    }

    /**
     * Gets known ScheduledType values.
     *
     * @return known ScheduledType values.
     */
    public static Collection<ScheduledType> values() {
        return values(ScheduledType.class);
    }
}
