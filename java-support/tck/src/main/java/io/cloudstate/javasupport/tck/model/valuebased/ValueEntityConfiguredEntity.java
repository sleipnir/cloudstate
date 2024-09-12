/*
 * Copyright 2019 Lightbend Inc.
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

package io.cloudstate.javasupport.tck.model.valuebased;

import io.cloudstate.javasupport.entity.CommandHandler;
import io.cloudstate.javasupport.entity.Entity;
import io.cloudstate.tck.model.valueentity.Valueentity.Request;
import io.cloudstate.tck.model.valueentity.Valueentity.Response;

@Entity(persistenceId = "value-entity-configured")
public class ValueEntityConfiguredEntity {

  @CommandHandler
  public Response call(Request request) {
    return Response.getDefaultInstance();
  }
}
