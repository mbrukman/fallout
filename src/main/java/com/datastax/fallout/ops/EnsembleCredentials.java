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
package com.datastax.fallout.ops;

import com.datastax.fallout.runner.UserCredentialsFactory.UserCredentials;
import com.datastax.fallout.service.FalloutConfiguration;
import com.datastax.fallout.service.core.User;

public class EnsembleCredentials
{
    private final UserCredentials userCredentials;
    private final FalloutConfiguration falloutConfiguration;

    public EnsembleCredentials(UserCredentials userCredentials, FalloutConfiguration falloutConfiguration)
    {
        this.userCredentials = userCredentials;
        this.falloutConfiguration = falloutConfiguration;
    }

    public User getUser()
    {
        return userCredentials.owner;
    }

    public FalloutConfiguration getFalloutConfiguration()
    {
        return falloutConfiguration;
    }
}