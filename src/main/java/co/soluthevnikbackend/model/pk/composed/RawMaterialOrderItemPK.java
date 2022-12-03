package co.soluthevnikbackend.model.pk.composed;

import co.soluthevnikbackend.model.RawMaterial;
import co.soluthevnikbackend.model.RawMaterialOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class RawMaterialOrderItemPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "raw_material_order_id")
    private RawMaterialOrder rawMaterialOrder;

    @ManyToOne
    @JoinColumn(name = "raw_material_id")
    private RawMaterial rawMaterial;

}
