package local.hablador.ordersapp.models;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;

import javax.persistence.*;
@Entity
@Table(name="agent")
public class Agent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long agentcode;

    private double commission;
    private String country;
    private String phone;
    private String workingarea;


}
