// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Deployment on error behavior. */
@Fluent
public final class OnErrorDeployment {
    /*
     * The deployment on error behavior type. Possible values are
     * LastSuccessful and SpecificDeployment.
     */
    @JsonProperty(value = "type")
    private OnErrorDeploymentType type;

    /*
     * The deployment to be used on error case.
     */
    @JsonProperty(value = "deploymentName")
    private String deploymentName;

    /**
     * Get the type property: The deployment on error behavior type. Possible values are LastSuccessful and
     * SpecificDeployment.
     *
     * @return the type value.
     */
    public OnErrorDeploymentType type() {
        return this.type;
    }

    /**
     * Set the type property: The deployment on error behavior type. Possible values are LastSuccessful and
     * SpecificDeployment.
     *
     * @param type the type value to set.
     * @return the OnErrorDeployment object itself.
     */
    public OnErrorDeployment withType(OnErrorDeploymentType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the deploymentName property: The deployment to be used on error case.
     *
     * @return the deploymentName value.
     */
    public String deploymentName() {
        return this.deploymentName;
    }

    /**
     * Set the deploymentName property: The deployment to be used on error case.
     *
     * @param deploymentName the deploymentName value to set.
     * @return the OnErrorDeployment object itself.
     */
    public OnErrorDeployment withDeploymentName(String deploymentName) {
        this.deploymentName = deploymentName;
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
