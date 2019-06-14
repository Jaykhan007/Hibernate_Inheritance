package model.single_table;

import javax.persistence.Entity;

@Entity(name = "DebitAccount")
public class DebitAccount_Single_Table_Inheritance extends Account_Single_Table_Inheritance {
    private double overdraftFee;

    public double getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(double overdraftFee) {
        this.overdraftFee = overdraftFee;
    }

    @Override
    public String toString() {
        return "DebitAccount{" +
                "overdraftFee=" + overdraftFee +
                '}';
    }
}