package co.soluthevnikbackend.model;

import co.soluthevnikbackend.model.pk.composed.SaleOrderItemPK;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "sale_order_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(SaleOrderItemPK.class)
public class SaleOrderItem {

    @Id @JoinColumn(name = "product_id") @ManyToOne
    private Product product;

    @Id @JoinColumn(name = "sale_order_id") @ManyToOne
    private SaleOrder saleOrder;

    @Column(name = "q_quantity")
    private Long q_quantity;

    @Column(name = "v_unit_price")
    private Double v_unit_price;

}
