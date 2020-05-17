package com.camel.springBoot.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.bindy.csv.BindyCsvDataFormat;
import org.apache.camel.spi.DataFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import com.camel.springBoot.domain.ItemClass;


@Component
public class SimpleRouteClass extends RouteBuilder {

	@Autowired
	Environment environment;
	@Override
	public void configure() throws Exception {
		log.info("starting the camel route");
		
		DataFormat bindy=new BindyCsvDataFormat(ItemClass.class);
		
		//from("timer:hello?period=1000s")
		//  startRoute: timer:hello?period=1000s
		from("{{fromRoute}}")
		.log("Timer onvoked the Body " +environment.getProperty("message"))
		//.pollEnrich("{{fromRoute}}")
		.to("{{toRoute}}")
		.unmarshal(bindy)
		.log("the unmarshl object is ${body}");
		
		log.info("ending of the route");
		
	}

}
