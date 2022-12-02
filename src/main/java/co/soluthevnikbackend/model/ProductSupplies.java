package co.soluthevnikbackend.model;

import  javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Entity
@Table(name = "product_supplies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ProductSupplies.class)
public class ProductSupplies implements Serializable {

    @Id @ManyToOne @JoinColumn(name = "raw_material_id")
    private RawMaterial rawMaterial;

    @Id @ManyToOne @JoinColumn(name = "product_id")
    private Product product;

}
