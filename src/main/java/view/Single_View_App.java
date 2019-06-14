package view;

import model.single_table.CreditAccount_Single_Table_Inheritance;
import model.single_table.DebitAccount_Single_Table_Inheritance;
import org.hibernate.Session;
import org.hibernate.Transaction;

import util.HibernateUtil;


public class Single_View_App {

    public static void main(String[] args) {

        // save the account object
        CreditAccount_Single_Table_Inheritance accountOne = new CreditAccount_Single_Table_Inheritance();
        accountOne.setBalance(10000.0);
        accountOne.setInterestRate(10.0);
        accountOne.setOwner("Kelly");
        accountOne.setCreditLimit(10000.0);


        DebitAccount_Single_Table_Inheritance debitAccount = new DebitAccount_Single_Table_Inheritance();
        debitAccount.setBalance(10000.0);
        debitAccount.setInterestRate(10.0);
        debitAccount.setOwner("Alicia");
        debitAccount.setOverdraftFee(35);

        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.save(accountOne);
            session.save(debitAccount);



/*            String hql = "from CreditAccountMappedSuperClass";
            Query query = session.createQuery(hql);
            List result = query.getResultList();
            System.out.println(result);

            transaction.commit();

 */


        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();

        }


    }
}

