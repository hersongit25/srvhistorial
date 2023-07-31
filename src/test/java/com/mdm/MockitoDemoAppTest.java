package com.mdm;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mdm.service.OrderService;
import com.mdm.service.ProductService;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class MockitoDemoAppTest {

	@Autowired
	private OrderService orderService;
	
	@Autowired
	private ProductService productService;
	
	@Test
	public void runTest() {
		System.out.println("Inicia Test");
//		 when a method is calling this line is calling
		Mockito.when( productService.getProductName() ).thenReturn(" method getProductName wass called ");
		
		String testName = orderService.getProductName();
		Assert.assertEquals("Mock Product Name: ", testName);
	}
}
