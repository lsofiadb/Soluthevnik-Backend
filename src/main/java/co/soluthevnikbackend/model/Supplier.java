package co.soluthevnikbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "supplier")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Supplier {

    @Id
    @Column(name = "k_id")
    private Long k_id;

    @Column(name = "n_name")
    private String n_name;

    @Column(name = "o_address")
    private String o_address;

    @Column(name = "o_phone_number")
    private Long o_phone_number;

}
