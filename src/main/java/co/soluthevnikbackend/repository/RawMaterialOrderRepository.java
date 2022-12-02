package co.soluthevnikbackend.repository;

import co.soluthevnikbackend.model.RawMaterialOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawMaterialOrderRepository extends JpaRepository<RawMaterialOrder, Long> {
}
