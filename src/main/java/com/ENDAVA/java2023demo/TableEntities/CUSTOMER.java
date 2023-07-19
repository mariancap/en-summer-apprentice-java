package com.ENDAVA.java2023demo.TableEntities;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "CUSTOMER")
public class CUSTOMER{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long customerID;
    @NotNull
    @Column ( name = "customer_name" )
    private String customerName;

    @NotNull
    @Column ( unique = true , name="email")
    private String email;

    public CUSTOMER() {
    }

    public CUSTOMER(Long customerID, String customerName, String email) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.email = email;
    }

    public Long getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Long customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
