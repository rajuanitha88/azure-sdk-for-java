// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;

/** Samples for SyncGroups ListSyncDatabaseIds. */
public final class SyncGroupsListSyncDatabaseIdsSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2015-05-01-preview/examples/SyncGroupGetSyncDatabaseId.json
     */
    /**
     * Sample code: Get a sync database ID.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getASyncDatabaseID(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getSyncGroups().listSyncDatabaseIds("westus", Context.NONE);
    }
}
