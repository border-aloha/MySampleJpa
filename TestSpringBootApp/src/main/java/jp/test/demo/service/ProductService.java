package jp.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.test.demo.model.ProductMaster;
import jp.test.demo.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public Page<ProductMaster> findAll(Pageable pageable) {
		return productRepository.findAll(pageable);
	}
}
