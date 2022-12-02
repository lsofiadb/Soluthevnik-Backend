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
@IdClass(RawMaterialOrderItemPK.class)
public class RawMaterialOrderItem {

    @Id @ManyToOne
    @JoinColumn(name = "raw_material_order_id")
    private RawMaterialOrder rawMaterialOrder;

    @Id @ManyToOne @JoinColumn(name = "raw_material_id")
    private RawMaterial rawMaterial;

    @Column(name = "q_quantity")
    private Long q_quantity;

    @Column(name = "v_unit_price")
    private Double v_unit_price;

}
