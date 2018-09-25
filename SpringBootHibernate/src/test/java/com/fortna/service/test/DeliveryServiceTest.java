package com.fortna.service.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fortna.service.DeliveryService;
import com.programmer.Application;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = { Application.class })
public class DeliveryServiceTest {

	@Autowired
	DeliveryService deliveryService;

	@Test
	public void saveDelivery03Test() {
		System.out.println(deliveryService);
	}
}
