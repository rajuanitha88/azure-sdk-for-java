// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** A DataFactory compute. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "computeType")
@JsonTypeName("DataFactory")
@Fluent
public final class DataFactory extends Compute {
    /** {@inheritDoc} */
    @Override
    public DataFactory withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFactory withResourceId(String resourceId) {
        super.withResourceId(resourceId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public DataFactory withDisableLocalAuth(Boolean disableLocalAuth) {
        super.withDisableLocalAuth(disableLocalAuth);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
