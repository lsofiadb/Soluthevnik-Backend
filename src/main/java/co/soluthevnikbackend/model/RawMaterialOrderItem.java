package co.soluthevnikbackend.model;

import co.soluthevnikbackend.model.pk.composed.RawMaterialOrderItemPK;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "raw_material_order_item")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialOrderItem {

    @EmbeddedId
    private RawMaterialOrderItemPK rawMaterialOrderItemPK;

    @Column(name = "q_quantity")
    private Long q_quantity;

    @Column(name = "v_unit_price")
    private Double v_unit_price;


}
