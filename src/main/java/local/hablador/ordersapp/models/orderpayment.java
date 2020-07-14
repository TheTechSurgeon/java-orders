package local.hablador.ordersapp.models;
import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="orderpayment")
public class orderpayment {

    private BigInteger ordnum;
    private BigInteger paymentid;
}
