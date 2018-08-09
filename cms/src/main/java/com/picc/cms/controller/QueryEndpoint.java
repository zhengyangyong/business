package com.picc.cms.controller;

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
