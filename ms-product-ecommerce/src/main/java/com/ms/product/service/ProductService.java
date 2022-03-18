package com.ms.product.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ms.product.model.Product;
import com.ms.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getProducts() {
		List<Product> products = productRepository.findAll();
		products.forEach(p-> {
			if(StringUtils.isEmpty(p.getImage())) {
				 String fileDownloadUri = ServletUriComponentsBuilder
				          .fromCurrentContextPath()
				          .path("/file/")
				          .path(p.getId().toString())
				          .toUriString();
				 p.setImage(fileDownloadUri);
			}
		});
		return products;
	}
	
	public void deleteProducts() {
		productRepository.deleteAll();
	}
	
	public Product saveProduct(MultipartFile fileImage) throws Exception {
		Product product = new Product();
		String productJson = fileImage.getOriginalFilename();
		try {
			productJson = productJson.replace("%22", "\\\"").replace("\\", "");
			product = new ObjectMapper().readValue(productJson, Product.class);

		    String fileName = StringUtils.cleanPath(fileImage.getOriginalFilename());
		    product.setNameFileImage(product.getImage());
		    product.setImage("");
			product.setTypeFileImage(fileImage.getContentType());
			product.setDataFileImage(fileImage.getBytes());
			product.setCreateDate(new Date());
		} catch (Exception e) {
			throw e;
		}
		return productRepository.save(product);
	}

	public Product getProduct(String id) {
		UUID idProduct = UUID.fromString(id);
		Optional<Product> opt = productRepository.findById(idProduct);
		return opt.get();
	}	
}
