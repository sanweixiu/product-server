package com.vshow.eshop.product.service;

import com.vshow.eshop.product.model.Category;

public interface CategoryService {
	
	public void add(Category category, String operationType);
	
	public void update(Category category, String operationType);
	
	public void delete(Long id, String operationType);
	
	public Category findById(Long id);
	
}
