package com.example.rest2soap;

import com.dataaccess.webservicesserver.NumberConversionSoapType;
import org.apache.cxf.ext.logging.LoggingFeature;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebServiceConfig {

  @Bean
  public NumberConversionSoapType numberConversionSoapType() {
    var proxy = new JaxWsProxyFactoryBean();
    proxy.setServiceClass(NumberConversionSoapType.class);
    proxy.setAddress("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
    proxy.getFeatures().add(new LoggingFeature());
    return (NumberConversionSoapType) proxy.create();
  }
}
