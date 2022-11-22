package com.imran.jpa;
import com.imran.jpa.entity.Customer;
import com.imran.jpa.entity.Item;
import com.imran.jpa.repository.CustomerRepository;
import com.imran.jpa.repository.ItemRepository;
import com.imran.jpa.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);

	}

     @Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private ItemRepository itemRepository;
	@Override
	public void run(String... args) throws Exception {
//
//		Customer customer=new Customer();
//		customer.setCustomerName("mohammed");
//
//		Item item1=new Item();
//		item1.setItemName("ps4");
//
//		Item item2=new Item();
//		item2.setItemName("pocof1");
//
//
//		customer.getItem().add(item1);
//		customer.getItem().add(item2);
		Item item1=new Item();
		item1.setItemName("iphonex");


		itemRepository.save(item1);

	}
}
