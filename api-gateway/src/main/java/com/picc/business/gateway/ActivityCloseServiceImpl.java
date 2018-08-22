package com.picc.business.gateway;

import java.util.HashMap;

import org.apache.servicecomb.provider.springmvc.reference.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import com.picc.business.common.GeneralRequest;
import com.picc.business.common.GeneralResponse;

public class ActivityCloseServiceImpl implements ActivityCloseService {

  private final RestTemplate template = RestTemplateBuilder.create();

  public String method1(String request) {

    //TODO:SOAP转JSON
    GeneralRequest scbRequest = new GeneralRequest();
    scbRequest.requesthead = new HashMap<String, String>();
    scbRequest.requesthead.put("user", "zyy");
    scbRequest.requesthead.put("request_type", "10001");
    scbRequest.requestbody = new HashMap<String, String>();
    scbRequest.requestbody.put("TaskId", "TASK201635000291183322");

    GeneralResponse scbResponse = template
        .postForObject("cse://cms-service/activityCloseService/method1", scbRequest, GeneralResponse.class);
    return scbResponse.responsebody.get("CallTrackId");
  }
}
