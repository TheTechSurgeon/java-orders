package local.hablador.ordersapp.models;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger custcode;

    @Column(nullable=false)
    private String custname;


    private String custcountry;
    private String custcity;
    private String grade;
    private double openingamt;
    private double recieveamt;
    private double outstandingamt;
    private String phone;
    @
    private Long agentcode;


    private List<Payment> payment = new ArrayList<>();

}
