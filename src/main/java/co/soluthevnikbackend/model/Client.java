package co.soluthevnikbackend.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {

    @Id
    @Column(name = "k_id")
    private Long k_id;

    @Column(name = "n_name")
    private String n_name;

    @Column(name = "n_lastname")
    private String n_lastname;

    @Column(name = "o_email")
    private String o_email;

    @Column(name = "o_phone_number")
    private Long o_phone_number;

    @Column(name = "o_address")
    private String o_address;

}
