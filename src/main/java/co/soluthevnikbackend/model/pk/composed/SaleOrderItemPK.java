package co.soluthevnikbackend.model.pk.composed;

import co.soluthevnikbackend.model.Product;
import co.soluthevnikbackend.model.SaleOrder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class SaleOrderItemPK implements Serializable {

    private Product product;

    private SaleOrder saleOrder;

}
