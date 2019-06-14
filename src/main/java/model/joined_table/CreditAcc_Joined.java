package model.joined_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "CreditAcc")
@PrimaryKeyJoinColumn(name = "Account_Id")
public class CreditAcc_Joined extends Account_Joined {


    private double creditLimit;


    public CreditAcc_Joined(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CreditAcc_Joined() {

    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "CreditAcc_Joined{" +
                "creditLimit=" + creditLimit +
                '}';
    }
}
