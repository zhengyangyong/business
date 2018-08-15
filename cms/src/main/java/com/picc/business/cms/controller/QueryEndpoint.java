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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "queryEndpoint")
@RequestMapping(path = "/cms")
public class QueryEndpoint {

  @GetMapping(path = "/quality_control")
  public String getQualityControl() {
    return "getQualityControl";
  }

  @GetMapping(path = "/record_share")
  public String getRecordShare() {
    return "getRecordShare";
  }

  @GetMapping(path = "/customer_view")
  public String getCustomerView() {
    return "getCustomerView";
  }

  @GetMapping(path = "/missed_calls")
  public String getMissedCalls() {
    return "getMissedCalls";
  }

  @GetMapping(path = "/task_detail")
  public String getTaskDetail() {
    return "getTaskDetail";
  }

  @GetMapping(path = "/seat_config")
  public String getSeatConfig() {
    return "getSeatConfig";
  }

  @GetMapping(path = "/seat_import_batch")
  public String getSeatImportBatch() {
    return "getSeatImportBatch";
  }

  @GetMapping(path = "/seat_track_with_process")
  public String getSeatTrackWithProcess() {
    return "getSeatTrackWithProcess";
  }

  @GetMapping(path = "/seat_track_without_process")
  public String getSeatTrackWithoutProcess() {
    return "getSeatTrackWithoutProcess";
  }
}
