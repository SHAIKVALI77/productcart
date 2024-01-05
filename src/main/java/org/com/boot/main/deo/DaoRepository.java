package org.com.boot.main.deo;

import org.com.boot.main.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DaoRepository extends JpaRepository<Product,Long> {
	
}
