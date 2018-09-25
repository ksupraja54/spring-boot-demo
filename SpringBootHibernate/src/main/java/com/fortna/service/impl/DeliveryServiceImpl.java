package com.fortna.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortna.entity.Delivery03;
import com.fortna.entity.Edidc40;
import com.fortna.repository.Delivery03Repo;
import com.fortna.repository.EdidcRepo;
import com.fortna.service.DeliveryService;

@Service
public class DeliveryServiceImpl implements DeliveryService {
	@Autowired
	private Delivery03Repo delivery03Repo;

	@Autowired
	private EdidcRepo edidcRepo;

	public void diplayOrSaveDeliveryMessage(String message) {
		List<Edidc40> messages = edidcRepo.getDeliveryMessage(message);
		if (messages != null && !messages.isEmpty()) {
			for (Edidc40 edidc40 : messages) {
				System.out.println(edidc40);
			}
		} else {
			// call save method
		}
	}

	@Override
	public void saveDeliveryMsg(Delivery03 delivery03) {
		delivery03Repo.save(delivery03);

	}

	public static void main(String[] args) {
		DeliveryServiceImpl deliveryServiceImpl = new DeliveryServiceImpl();
		deliveryServiceImpl.diplayOrSaveDeliveryMessage("SHPCON");
	}
}
