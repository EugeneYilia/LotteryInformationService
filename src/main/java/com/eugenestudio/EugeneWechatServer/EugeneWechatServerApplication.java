package com.eugenestudio.EugeneWechatServer;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;


@SpringBootApplication
@MapperScan("com.eugenestudio.EugeneWechatServer.mapper")
public class EugeneWechatServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(EugeneWechatServerApplication.class, args);
	}

	@Bean
	public EmbeddedServletContainerFactory servletContainer(){
		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory(){
			@Override
			protected void postProcessContext(Context context) {
				SecurityConstraint securityConstraint = new SecurityConstraint();
				securityConstraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection securityCollection = new SecurityCollection();
                securityCollection.addPattern("/*");
                securityConstraint.addCollection(securityCollection);
                context.addConstraint(securityConstraint);
			}
		};
        tomcat.addAdditionalTomcatConnectors(httpConnector());
        return tomcat;
	}

	public Connector httpConnector(){
	    Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
	    connector.setScheme("http");
	    connector.setPort(80);
	    connector.setSecure(false);
	    connector.setRedirectPort(443);
	    return connector;
    }
}
