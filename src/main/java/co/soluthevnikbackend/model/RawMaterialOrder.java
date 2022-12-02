package co.soluthevnikbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "raw_material_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterialOrder {

    @Id @Column(name = "k_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long k_id;

    @JoinColumn(name = "supplier_id") @ManyToOne
    private Supplier supplier;

    @JoinColumn(name = "admin_id") @ManyToOne
    private Admin admin;

    @Column(name = "d_date")
    private Date d_date;

    @Column(name = "v_total_price")
    private Double v_total_price;

}
