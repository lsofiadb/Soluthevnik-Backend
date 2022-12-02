package co.soluthevnikbackend.repository;

import co.soluthevnikbackend.model.ProductSupplies;
import co.soluthevnikbackend.model.pk.composed.ProductSuppliesPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSuppliesRepository extends JpaRepository<ProductSupplies, ProductSuppliesPK> {
}
