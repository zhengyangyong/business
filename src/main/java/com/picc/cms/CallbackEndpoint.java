package com.picc.cms;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "callbackEndpoint")
@RequestMapping(path = "/cms")
public class CallbackEndpoint {

  @RequestMapping(path = "/callback")
  public class CallbackExEndpoint {

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

  @GetMapping(path = "/incompleted_seattrack")
  public String getIncompletedSeattracks() {
    return "getIncompletedSeattracks";
  }
}
