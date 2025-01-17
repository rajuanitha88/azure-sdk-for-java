// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.email;

import com.azure.communication.email.models.SendEmailResult;
import com.azure.communication.email.models.SendStatusResult;
import com.azure.communication.email.models.EmailMessage;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;

/** Initializes a new instance of the synchronous EmailClient type. */
@ServiceClient(builder = EmailClientBuilder.class)
public final class EmailClient {
    private final EmailAsyncClient client;

    /**
     * Initializes an instance of EmailClient class.
     *
     * @param client the async client.
     */
    EmailClient(EmailAsyncClient client) {
        this.client = client;
    }

    /**
     * Gets the status of a message sent previously.
     * @param messageId System generated message id (GUID) returned from a previous call to send email.
     * @return the status of a message sent previously
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SendStatusResult getSendStatus(String messageId) {
        return this.client.getSendStatus(messageId).block();
    }

    /**
     * Queues an email message to be sent to one or more recipients
     * @param emailMessage Message payload for sending an email.
     * @return the result of the email sent
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SendEmailResult send(EmailMessage emailMessage) {
        return this.client.send(emailMessage).block();
    }
}
