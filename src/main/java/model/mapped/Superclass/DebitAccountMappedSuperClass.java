package model.mapped.Superclass;


import javax.persistence.Entity;

@Entity(name = "DebitAccountMappedSuperClass")
public class DebitAccountMappedSuperClass extends AccountMappedSuperClass {
    private double overdraftfree;

    public double getOverdraftfree() {
        return overdraftfree;
    }

    public void setOverdraftfree(double overdraftfree) {
        this.overdraftfree = overdraftfree;


    }

    @Override
    public String toString() {
        return "DebitAccountMappedSuperClass{" +
                "overdraftfree=" + overdraftfree +
                '}';
    }
}
