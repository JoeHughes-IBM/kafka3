/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.kafka.clients.admin;

import org.apache.kafka.common.annotation.InterfaceStability;

/**
 * Options for listTopics.
 */
@InterfaceStability.Unstable
public class ListTopicsOptions {
    private Integer timeoutMs = null;
    private boolean listInternal = false;

    public ListTopicsOptions timeoutMs(Integer timeoutMs) {
        this.timeoutMs = timeoutMs;
        return this;
    }

    public Integer timeoutMs() {
        return timeoutMs;
    }

    /**
     * Set whether we should list internal topics.
     *
     * @param listInternal  Whether we should list internal topics.  null means to use
     *                      the default.
     * @return              This ListTopicsOptions object.
     */
    public ListTopicsOptions listInternal(boolean listInternal) {
        this.listInternal = listInternal;
        return this;
    }

    public boolean listInternal() {
        return listInternal;
    }
}
