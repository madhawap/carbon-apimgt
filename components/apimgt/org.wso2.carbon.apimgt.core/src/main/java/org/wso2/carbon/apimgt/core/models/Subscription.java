/*
 *
 *   Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *   WSO2 Inc. licenses this file to you under the Apache License,
 *   Version 2.0 (the "License"); you may not use this file except
 *   in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.apimgt.core.models;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.wso2.carbon.apimgt.core.util.APIMgtConstants;

import java.util.Objects;

/**
 * Subscriber's view of the API
 */
public final class Subscription {

    private String uuid;
    private API api;
    private Application application;
    private String subscriptionTier;
    private APIMgtConstants.SubscriptionStatus status;
    private String subscriptionPolicyId;

    public Subscription(String uuid, Application application, API api, String subscriptionTier) {
        this.uuid = uuid;
        this.application = application;
        this.api = api;
        this.subscriptionTier = subscriptionTier;
    }

    public Application getApplication() {
        return application;
    }

    public API getApi() {
        return api;
    }

    public String getId() {
        return uuid;
    }

    public String getSubscriptionTier() {
        return subscriptionTier;
    }

    public APIMgtConstants.SubscriptionStatus getStatus() {
        return status;
    }

    public void setStatus(APIMgtConstants.SubscriptionStatus status) {
        this.status = status;
    }

    public String getSubscriptionPolicyId() {
        return subscriptionPolicyId;
    }

    public void setSubscriptionPolicyId(String subscriptionPolicyId) {
        this.subscriptionPolicyId = subscriptionPolicyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Subscription that = (Subscription) o;
        return Objects.equals(uuid, that.uuid) &&
                Objects.equals(api, that.api) &&
                Objects.equals(application, that.application) &&
                Objects.equals(subscriptionTier, that.subscriptionTier) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, api, application, subscriptionTier, status);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("uuid", uuid)
                .append("api", api)
                .append("application", application)
                .append("subscriptionTier", subscriptionTier)
                .append("status", status)
                .toString();
    }
}
