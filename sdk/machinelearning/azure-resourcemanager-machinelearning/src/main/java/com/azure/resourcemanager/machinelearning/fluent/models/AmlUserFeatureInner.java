// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Features enabled for a workspace. */
@Fluent
public final class AmlUserFeatureInner {
    /*
     * Specifies the feature ID
     */
    @JsonProperty(value = "id")
    private String id;

    /*
     * Specifies the feature name
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Describes the feature for user experience
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the id property: Specifies the feature ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Specifies the feature ID.
     *
     * @param id the id value to set.
     * @return the AmlUserFeatureInner object itself.
     */
    public AmlUserFeatureInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the displayName property: Specifies the feature name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Specifies the feature name.
     *
     * @param displayName the displayName value to set.
     * @return the AmlUserFeatureInner object itself.
     */
    public AmlUserFeatureInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the description property: Describes the feature for user experience.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Describes the feature for user experience.
     *
     * @param description the description value to set.
     * @return the AmlUserFeatureInner object itself.
     */
    public AmlUserFeatureInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
