package view;

import model.mapped.Superclass.CreditAccountMappedSuperClass;
import model.mapped.Superclass.DebitAccountMappedSuperClass;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class MappedSupperClass_View {

    public static void main(String[] args) {
        CreditAccountMappedSuperClass accountOne = new CreditAccountMappedSuperClass();

        accountOne.setBalance(1299.99);
        accountOne.setInterestRate(23);
        accountOne.setOwner("TestOneUser");
        accountOne.setCreditlimit(15000.00);

        DebitAccountMappedSuperClass accountDebit1 = new DebitAccountMappedSuperClass();
        accountDebit1.setOverdraftfree(45);
        accountDebit1.setBalance(4568.89);
        accountDebit1.setOwner("Debitcard");
        accountDebit1.setInterestRate(10);





        Transaction transaction = null;

        try(Session session = HibernateUtil.getSessionFactory().openSession()){

            transaction = session.beginTransaction();
            session.save(accountOne);
            session.save(accountDebit1);



/*            String hql = "from CreditAccountMappedSuperClass";
            Query query = session.createQuery(hql);
            List result = query.getResultList();
            System.out.println(result);

            transaction.commit();

 */


        }catch (Exception e){
            if (transaction != null){
                transaction.rollback();
            }
            e.printStackTrace();

        }
    }
}
