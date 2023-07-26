package com.ENDAVA.java2023demo.TableEntities;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "CUSTOMER")
public class CUSTOMER{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int customerID;


    @Column ( name = "customer_name" )
    private String customer_name;


    @Column ( unique = true , name="email")
    private String email;

    public CUSTOMER() {
    }

    public CUSTOMER(int customerID, String customer_name, String email) {
        customerID = customerID;
        this.customer_name = customer_name;
        this.email = email;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        customerID = customerID;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
