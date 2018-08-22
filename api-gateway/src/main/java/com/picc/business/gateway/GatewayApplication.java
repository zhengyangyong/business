package com.picc.business.gateway;

import org.apache.cxf.frontend.ServerFactoryBean;
import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

import com.netflix.config.DynamicPropertyFactory;

public class GatewayApplication {
  public static void main(String[] args) throws Exception {
    Log4jUtils.init();
    BeanUtils.init();

    ActivityCloseServiceImpl serviceImpl = new ActivityCloseServiceImpl();
    ServerFactoryBean svrFactory = new ServerFactoryBean();
    svrFactory.setServiceClass(ActivityCloseService.class);

    String address = DynamicPropertyFactory.getInstance()
        .getStringProperty("webservice.activityCloseService.address", null).get();
    if (address != null) {
      svrFactory.setAddress(address);
      svrFactory.setServiceBean(serviceImpl);
      svrFactory.create();
    }
  }
}
