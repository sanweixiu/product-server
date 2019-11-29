package com.vshow.eshop.product.service;

import com.vshow.eshop.product.model.ProductIntro;

public interface ProductIntroService {
	
	public void add(ProductIntro productIntro, String operationType);
	
	public void update(ProductIntro productIntro, String operationType);
	
	public void delete(Long id, String operationType);
	
	public ProductIntro findById(Long id);
	
}
