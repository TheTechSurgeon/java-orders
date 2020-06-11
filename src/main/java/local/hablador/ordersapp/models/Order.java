package local.hablador.ordersapp.models;
import org.hibernate.type.descriptor.sql.VarcharTypeDescriptor;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name=Orders)
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger ordnum;

    private double advanceamount;
    private VarcharTypeDescriptor orderdescription;
    private BigInteger custcode;


}
