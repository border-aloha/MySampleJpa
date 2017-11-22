package jp.test.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.test.demo.model.ProductMaster;

@Repository
public interface ProductRepository extends JpaRepository<ProductMaster, Long> {

	public Page<ProductMaster> findAll(Pageable pageable);
}
