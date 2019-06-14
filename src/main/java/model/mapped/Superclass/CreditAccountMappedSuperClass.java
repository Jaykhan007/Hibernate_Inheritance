package model.mapped.Superclass;

import javax.persistence.Entity;

@Entity(name = "CreditAccountMappedSuperClass")
public class CreditAccountMappedSuperClass extends AccountMappedSuperClass {

    private double creditlimit;

    public double getCreditlimit() {
        return creditlimit;
    }

    public void setCreditlimit(double creditlimit) {
        this.creditlimit = creditlimit;
    }

    @Override
    public String toString() {
        return "CreditAccountMappedSuperClass{" +
                "creditlimit=" + creditlimit +
                '}';
    }
}
