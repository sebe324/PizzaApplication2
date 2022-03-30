package pl.sebastian.pizza.data.entity.order;

import pl.sebastian.pizza.data.entity.ordersize.OrderSizeEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "orders")

public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private String clientName;

    @Column(name = "client_adress")
    private String clientAdress;

    @Column(name = "client_phone")
    private String clientPhone;

    @Column(name = "floor")
    private String floor;

    @Column(name = "status")
    private String status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at")
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expected_at")
    private Date expectedAt;

    @Column(name = "token")
    private String token;

    //1 zamówienie może mieć wiele sizów
    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> orderSizes;


}
