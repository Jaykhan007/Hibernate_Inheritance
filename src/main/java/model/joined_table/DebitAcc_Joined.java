package model.joined_table;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity(name = "DebitAcc")
@PrimaryKeyJoinColumn(name = "Account_Id")
public class DebitAcc_Joined extends Account_Joined{

    private double overdraftfee;


    public DebitAcc_Joined(double overdraftfee) {
        this.overdraftfee = overdraftfee;
    }

    public DebitAcc_Joined() {

    }

    public double getOverdraftfee() {
        return overdraftfee;
    }

    public void setOverdraftfee(double overdraftfee) {
        this.overdraftfee = overdraftfee;
    }

    @Override
    public String toString() {
        return "DebitAcc_Joined{" +
                "overdraftfee=" + overdraftfee +
                '}';
    }
}
