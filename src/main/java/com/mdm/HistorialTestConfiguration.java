package com.mdm;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import org.mockito.Mockito;

import com.mdm.service.ProductService;

@Profile("test")
@Configuration
public class HistorialTestConfiguration {

	@Bean
	@Primary
	public ProductService productService() {
		return Mockito.mock( ProductService.class );
	}
}