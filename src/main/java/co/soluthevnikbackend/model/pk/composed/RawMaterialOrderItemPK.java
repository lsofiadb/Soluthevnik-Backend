package co.soluthevnikbackend.model.pk.composed;

import co.soluthevnikbackend.model.RawMaterial;
import co.soluthevnikbackend.model.RawMaterialOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialOrderItemPK implements Serializable {

    private RawMaterialOrder rawMaterialOrder;
    private RawMaterial rawMaterial;

}
