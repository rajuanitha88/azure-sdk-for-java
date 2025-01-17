// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.IpAllocationType;
import com.azure.resourcemanager.network.models.IpVersion;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** IpAllocation resource. */
@Fluent
public final class IpAllocationInner extends Resource {
    /*
     * Properties of the IpAllocation.
     */
    @JsonProperty(value = "properties")
    private IpAllocationPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the IpAllocation.
     *
     * @return the innerProperties value.
     */
    private IpAllocationPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IpAllocationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IpAllocationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the subnet property: The Subnet that using the prefix of this IpAllocation resource.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Get the virtualNetwork property: The VirtualNetwork that using the prefix of this IpAllocation resource.
     *
     * @return the virtualNetwork value.
     */
    public SubResource virtualNetwork() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetwork();
    }

    /**
     * Get the type property: The type for the IpAllocation.
     *
     * @return the type value.
     */
    public IpAllocationType typePropertiesType() {
        return this.innerProperties() == null ? null : this.innerProperties().type();
    }

    /**
     * Set the type property: The type for the IpAllocation.
     *
     * @param type the type value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withTypePropertiesType(IpAllocationType type) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withType(type);
        return this;
    }

    /**
     * Get the prefix property: The address prefix for the IpAllocation.
     *
     * @return the prefix value.
     */
    public String prefix() {
        return this.innerProperties() == null ? null : this.innerProperties().prefix();
    }

    /**
     * Set the prefix property: The address prefix for the IpAllocation.
     *
     * @param prefix the prefix value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefix(String prefix) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefix(prefix);
        return this;
    }

    /**
     * Get the prefixLength property: The address prefix length for the IpAllocation.
     *
     * @return the prefixLength value.
     */
    public Integer prefixLength() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixLength();
    }

    /**
     * Set the prefixLength property: The address prefix length for the IpAllocation.
     *
     * @param prefixLength the prefixLength value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixLength(Integer prefixLength) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefixLength(prefixLength);
        return this;
    }

    /**
     * Get the prefixType property: The address prefix Type for the IpAllocation.
     *
     * @return the prefixType value.
     */
    public IpVersion prefixType() {
        return this.innerProperties() == null ? null : this.innerProperties().prefixType();
    }

    /**
     * Set the prefixType property: The address prefix Type for the IpAllocation.
     *
     * @param prefixType the prefixType value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withPrefixType(IpVersion prefixType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withPrefixType(prefixType);
        return this;
    }

    /**
     * Get the ipamAllocationId property: The IPAM allocation ID.
     *
     * @return the ipamAllocationId value.
     */
    public String ipamAllocationId() {
        return this.innerProperties() == null ? null : this.innerProperties().ipamAllocationId();
    }

    /**
     * Set the ipamAllocationId property: The IPAM allocation ID.
     *
     * @param ipamAllocationId the ipamAllocationId value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withIpamAllocationId(String ipamAllocationId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withIpamAllocationId(ipamAllocationId);
        return this;
    }

    /**
     * Get the allocationTags property: IpAllocation tags.
     *
     * @return the allocationTags value.
     */
    public Map<String, String> allocationTags() {
        return this.innerProperties() == null ? null : this.innerProperties().allocationTags();
    }

    /**
     * Set the allocationTags property: IpAllocation tags.
     *
     * @param allocationTags the allocationTags value to set.
     * @return the IpAllocationInner object itself.
     */
    public IpAllocationInner withAllocationTags(Map<String, String> allocationTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IpAllocationPropertiesFormat();
        }
        this.innerProperties().withAllocationTags(allocationTags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
