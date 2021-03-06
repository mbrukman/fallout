/*
 * Copyright 2020 DataStax, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datastax.fallout.ops.providers;

import com.datastax.fallout.ops.Node;
import com.datastax.fallout.ops.Provider;

public class DataStaxCassOperatorProvider extends Provider
{
    private final String clusterService;

    public DataStaxCassOperatorProvider(Node node, String clusterName, String datacenterName)
    {
        super(node);
        this.clusterService = String.format("%s-%s-service", clusterName, datacenterName);
    }

    @Override
    public String name()
    {
        return "ds_cass_operator";
    }

    public String getClusterService()
    {
        return clusterService;
    }
}
