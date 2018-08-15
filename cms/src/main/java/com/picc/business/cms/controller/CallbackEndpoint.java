/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.picc.business.cms.controller;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "callbackEndpoint")
@RequestMapping(path = "/cms/callback")
public class CallbackEndpoint {
  @PostMapping(path = "/call_result")
  public String callResult() {
    return "callResult";
  }

  @PostMapping(path = "/ring_time")
  public String ringTime() {
    return "ringTime";
  }

  @PostMapping(path = "/start_time")
  public String startTime() {
    return "startTime";
  }

  @PostMapping(path = "/end_time")
  public String endTime() {
    return "endTime";
  }

  @PostMapping(path = "/record_id")
  public String recordId() {
    return "recordId";
  }

  @PostMapping(path = "/batch_update")
  public String batchUpdate() {
    return "batchUpdate";
  }
}
