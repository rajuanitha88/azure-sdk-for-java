// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Weekday. */
public final class Weekday extends ExpandableStringEnum<Weekday> {
    /** Static value Monday for Weekday. */
    public static final Weekday MONDAY = fromString("Monday");

    /** Static value Tuesday for Weekday. */
    public static final Weekday TUESDAY = fromString("Tuesday");

    /** Static value Wednesday for Weekday. */
    public static final Weekday WEDNESDAY = fromString("Wednesday");

    /** Static value Thursday for Weekday. */
    public static final Weekday THURSDAY = fromString("Thursday");

    /** Static value Friday for Weekday. */
    public static final Weekday FRIDAY = fromString("Friday");

    /** Static value Saturday for Weekday. */
    public static final Weekday SATURDAY = fromString("Saturday");

    /** Static value Sunday for Weekday. */
    public static final Weekday SUNDAY = fromString("Sunday");

    /**
     * Creates or finds a Weekday from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Weekday.
     */
    @JsonCreator
    public static Weekday fromString(String name) {
        return fromString(name, Weekday.class);
    }

    /**
     * Gets known Weekday values.
     *
     * @return known Weekday values.
     */
    public static Collection<Weekday> values() {
        return values(Weekday.class);
    }
}
