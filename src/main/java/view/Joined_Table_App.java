package view;

import model.joined_table.CreditAcc_Joined;
import model.joined_table.DebitAcc_Joined;
import model.single_table.CreditAccount_Single_Table_Inheritance;
import model.single_table.DebitAccount_Single_Table_Inheritance;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

public class Joined_Table_App {

    public static void main(String[] args) {

        // save the account object

        DebitAcc_Joined debitAccount = new DebitAcc_Joined();
        debitAccount.setOverdraftfee(23);
        debitAccount.setOverdraftfee(25);
        debitAccount.setBalance(4444444);
        debitAccount.setOwner("Cooker");
        debitAccount.setInterestRate(55);


        CreditAcc_Joined creditAccount = new CreditAcc_Joined();
        creditAccount.setCreditLimit(35000);
        creditAccount.setBalance(12222.00);
        creditAccount.setOwner("Lubbi");
        creditAccount.setInterestRate(22);


        Transaction transaction = null;

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();
            session.save(debitAccount);
            session.save(creditAccount);



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
