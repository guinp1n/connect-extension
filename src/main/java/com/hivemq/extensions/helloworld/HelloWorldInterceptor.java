/*
 * Copyright 2018-present HiveMQ GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hivemq.extensions.helloworld;

import com.hivemq.extension.sdk.api.annotations.NotNull;
import com.hivemq.extension.sdk.api.interceptor.connect.ConnectInboundInterceptor;
import com.hivemq.extension.sdk.api.interceptor.connect.parameter.ConnectInboundInput;
import com.hivemq.extension.sdk.api.interceptor.connect.parameter.ConnectInboundOutput;
import com.hivemq.extension.sdk.api.interceptor.publish.PublishInboundInterceptor;
import com.hivemq.extension.sdk.api.packets.publish.ModifiableConnectPacket;


/**
 *
 * @author Dasha Samkova
 * @since 4.35.0
 */
public class HelloWorldInterceptor implements ConnectInboundInterceptor {

    @Override
    public void onConnect(
            final @NotNull ConnectInboundInput connectInboundInput,
            final @NotNull ConnectInboundOutput connectInboundOutput) {

        final ModifiableConnectPacket connectPacket = connectInboundOutput.getConnectPacket();
        connectPacket.setKeepAlive(66);
    }
}