package local.hablador.ordersapp.models;


import javax.persistence.*;

import java.math.BigInteger;
@Entity
@Table(name="payment")
public class Payment {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, unique = true)
    private long paymentid;

    private String type;


}
