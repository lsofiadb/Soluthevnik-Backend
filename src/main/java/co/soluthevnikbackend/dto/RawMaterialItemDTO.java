package co.soluthevnikbackend.dto;

import co.soluthevnikbackend.model.RawMaterialOrderItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RawMaterialItemDTO {

    private Long raw_material_order_id;
    private Long raw_material_id;
    private Long q_quantity;
    private Double v_unit_price;

    public RawMaterialOrderItem getRawMaterialOrderItem(RawMaterialItemDTO rawMaterialItemDTO){
        RawMaterialOrderItem rawMaterialOrderItem = new RawMaterialOrderItem();
        rawMaterialOrderItem.setQ_quantity(rawMaterialItemDTO.getQ_quantity());
        rawMaterialOrderItem.setV_unit_price(rawMaterialItemDTO.getV_unit_price());
        return rawMaterialOrderItem;
    }

}
