package com.its4u.sso.rest.controler;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.its4u.sso.rest.model.Product;

@RestController
@RequestMapping("/rest/products")
public class ProductController {

	@RequestMapping()
	public List<Product> retrieveProducts() {

		final Product sbPhoneXl = new Product();
		sbPhoneXl.setId(101);
		sbPhoneXl.setName("SpringBoot: Phone XL");
		sbPhoneXl.setDescription("A large phone with one of the best screens");

		final Product sbPhoneMini = new Product();
		sbPhoneMini.setId(102);
		sbPhoneMini.setName("SpringBoot: Phone Mini");
		sbPhoneMini.setDescription(" A great phone with one of the best cameras");

		final Product sbPhoneStandard = new Product();
		sbPhoneStandard.setId(103);
		sbPhoneStandard.setName("SpringBoot: Phone Standard");
		sbPhoneStandard.setDescription(" A stardard phone with no special feature ");

		return Arrays.asList(sbPhoneXl, sbPhoneMini, sbPhoneStandard);
	}

}