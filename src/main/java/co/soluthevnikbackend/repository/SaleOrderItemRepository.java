package co.soluthevnikbackend.repository;

import co.soluthevnikbackend.model.SaleOrderItem;
import co.soluthevnikbackend.model.pk.composed.SaleOrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleOrderItemRepository extends JpaRepository<SaleOrderItem, SaleOrderItemPK> {
}
