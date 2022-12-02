package co.soluthevnikbackend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "admin")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @Column(name = "k_id")
    private Long k_id;

    @Column(name = "n_name")
    private String n_name;

    @Column(name = "n_lastname")
    private String n_lastname;

    @Column(name = "o_password")
    private String o_password;

}
