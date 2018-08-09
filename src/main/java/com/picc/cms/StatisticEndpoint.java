package com.picc.cms;

import org.apache.servicecomb.provider.rest.common.RestSchema;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestSchema(schemaId = "statisticEndpoint")
@RequestMapping(path = "/cms")
public class StatisticEndpoint {

  @GetMapping(path = "/activity_statistics")
  public String getActivityStatistics() {
    return "getActivityStatistics";
  }
}
