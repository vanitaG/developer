//package com.camel.springBoot.routes;
//
//import static org.junit.Assert.*;
//
//import java.io.File;
//
//import org.apache.camel.Exchange;
//import org.apache.camel.ProducerTemplate;
//import org.apache.camel.test.spring.CamelSpringBootRunner;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.env.Environment;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.ActiveProfiles;
//
//@ActiveProfiles("dev")
//@RunWith(CamelSpringBootRunner.class)
//@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
//@SpringBootTest
//public class SimpleRouteClassTest {
//
//	@Autowired
//	ProducerTemplate producerTemplate;
//	
//	@Autowired
//	Environment environment;
//	
//	@Test
//	public void testMoveFile() throws InterruptedException
//	{
//		String message = "type,sku#,itemsdescription,price\n "+
//                      "ADD,100,Samsug tv,300\n" +
//                      " ADD,101,Lg tv,300";
//		String fileName="fileTest.txt";
//		
//		producerTemplate.sendBodyAndHeader(environment.getProperty("fromRoute")
//				,message, Exchange.FILE_NAME,fileName);
//		
//		Thread.sleep(3000);
//		
//		File outFile= new File("data/output/"+fileName);
//		assertTrue(outFile.exists());
//	}
//}
//
//
