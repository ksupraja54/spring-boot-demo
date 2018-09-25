package com.fortna;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.fortna.entity.Delivery03;
import com.fortna.entity.EsbShpConIDoc;
import com.fortna.service.DeliveryService;

/*@SpringBootApplication*/
public class DeliveryApplication implements CommandLineRunner {

	@Autowired
	DeliveryService deliveryService;

	public static void main(String[] args) {
		SpringApplication.run(DeliveryApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Delivery03 delivery03=new Delivery03();
		delivery03.setCreatedBy(new Date());
		delivery03.setUpdatedBy(new Date());
		delivery03.setId(new Long(1));
		EsbShpConIDoc esbShpConIDoc=new EsbShpConIDoc();
		esbShpConIDoc.setId(new Long(1) );
		esbShpConIDoc.setBegin("abc");
		delivery03.setEsbShpConIDoc(esbShpConIDoc);
		deliveryService.saveDeliveryMsg(delivery03);
	}

}
