package co.soluthevnikbackend.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "sale_order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleOrder{

    @Id
    @Column(name = "k_id")
    private Long k_id;

    @ManyToOne @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne @JoinColumn(name = "admin_id")
    private Admin admin;

    @Column(name = "d_date")
    private Date d_date;

    @Column(name = "total_price")
    private Double total_price;

}
