// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.Map;

/** Azure Blob datastore configuration. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "datastoreType")
@JsonTypeName("AzureBlob")
@Fluent
public final class AzureBlobDatastore extends DatastoreDetails {
    /*
     * Storage account name.
     */
    @JsonProperty(value = "accountName")
    private String accountName;

    /*
     * Storage account container name.
     */
    @JsonProperty(value = "containerName")
    private String containerName;

    /*
     * Azure cloud endpoint for the storage account.
     */
    @JsonProperty(value = "endpoint")
    private String endpoint;

    /*
     * Protocol used to communicate with the storage account.
     */
    @JsonProperty(value = "protocol")
    private String protocol;

    /*
     * Indicates which identity to use to authenticate service data access to
     * customer's storage.
     */
    @JsonProperty(value = "serviceDataAccessAuthIdentity")
    private ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity;

    /**
     * Get the accountName property: Storage account name.
     *
     * @return the accountName value.
     */
    public String accountName() {
        return this.accountName;
    }

    /**
     * Set the accountName property: Storage account name.
     *
     * @param accountName the accountName value to set.
     * @return the AzureBlobDatastore object itself.
     */
    public AzureBlobDatastore withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * Get the containerName property: Storage account container name.
     *
     * @return the containerName value.
     */
    public String containerName() {
        return this.containerName;
    }

    /**
     * Set the containerName property: Storage account container name.
     *
     * @param containerName the containerName value to set.
     * @return the AzureBlobDatastore object itself.
     */
    public AzureBlobDatastore withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * Get the endpoint property: Azure cloud endpoint for the storage account.
     *
     * @return the endpoint value.
     */
    public String endpoint() {
        return this.endpoint;
    }

    /**
     * Set the endpoint property: Azure cloud endpoint for the storage account.
     *
     * @param endpoint the endpoint value to set.
     * @return the AzureBlobDatastore object itself.
     */
    public AzureBlobDatastore withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * Get the protocol property: Protocol used to communicate with the storage account.
     *
     * @return the protocol value.
     */
    public String protocol() {
        return this.protocol;
    }

    /**
     * Set the protocol property: Protocol used to communicate with the storage account.
     *
     * @param protocol the protocol value to set.
     * @return the AzureBlobDatastore object itself.
     */
    public AzureBlobDatastore withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     *
     * @return the serviceDataAccessAuthIdentity value.
     */
    public ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity() {
        return this.serviceDataAccessAuthIdentity;
    }

    /**
     * Set the serviceDataAccessAuthIdentity property: Indicates which identity to use to authenticate service data
     * access to customer's storage.
     *
     * @param serviceDataAccessAuthIdentity the serviceDataAccessAuthIdentity value to set.
     * @return the AzureBlobDatastore object itself.
     */
    public AzureBlobDatastore withServiceDataAccessAuthIdentity(
        ServiceDataAccessAuthIdentity serviceDataAccessAuthIdentity) {
        this.serviceDataAccessAuthIdentity = serviceDataAccessAuthIdentity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDatastore withCredentials(DatastoreCredentials credentials) {
        super.withCredentials(credentials);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDatastore withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDatastore withProperties(Map<String, String> properties) {
        super.withProperties(properties);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobDatastore withTags(Map<String, String> tags) {
        super.withTags(tags);
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
