package com.picc.business.cms.controller;

import java.util.HashMap;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.picc.business.common.GeneralRequest;
import com.picc.business.common.GeneralResponse;

//这个Endpoint用于模拟响应API-Gateway请求
// cse://cms-service/activityCloseService
@RestSchema(schemaId = "activityCloseServiceEndpoint")
@RequestMapping(path = "/activityCloseService")
public class ActivityCloseServiceEndpoint {

  // cse://cms-service/activityCloseService/method1
  @PostMapping(path = "/method1")
  public GeneralResponse method1(@RequestBody GeneralRequest request) {
    GeneralResponse response = new GeneralResponse();
    response.responsehead = new HashMap<>();
    response.responsehead.put("timestamp", "2018-08-22 10:00:00");
    response.responsehead.put("error_message", "");
    response.responsebody = new HashMap<>();
    response.responsebody.put("CallTrackId", "TMST201635000005743598");
    return response;
  }
}
