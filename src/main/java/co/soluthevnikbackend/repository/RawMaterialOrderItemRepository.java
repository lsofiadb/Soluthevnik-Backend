package co.soluthevnikbackend.repository;

import co.soluthevnikbackend.model.RawMaterialOrderItem;
import co.soluthevnikbackend.model.pk.composed.RawMaterialOrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RawMaterialOrderItemRepository extends JpaRepository<RawMaterialOrderItem, RawMaterialOrderItemPK> {
}
