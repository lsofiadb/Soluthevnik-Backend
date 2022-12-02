package co.soluthevnikbackend.model.pk.composed;

import co.soluthevnikbackend.model.Product;
import co.soluthevnikbackend.model.RawMaterial;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
public class ProductSuppliesPK implements Serializable {

    private RawMaterial rawMaterial;

    private Product product;

}
