package co.soluthevnikbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "raw_material")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RawMaterial {

    @Id
    @Column(name = "k_id")
    private Long k_id;

    @Column(name = "n_name")
    private String n_name;

    @Column(name = "o_description")
    private String o_description;

    @Column(name = "o_weight")
    private Double o_weight;

}
