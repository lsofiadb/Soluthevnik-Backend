package co.soluthevnikbackend.model.pk.composed;

import co.soluthevnikbackend.model.Product;
import co.soluthevnikbackend.model.SaleOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class SaleOrderItemPK implements Serializable {

    @JoinColumn(name = "product_id") @ManyToOne
    private Product product;

    @JoinColumn(name = "sale_order_id") @ManyToOne
    private SaleOrder saleOrder;

}
