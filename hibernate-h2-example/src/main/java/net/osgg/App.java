package net.osgg;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


import net.osgg.entity.Provincia;
import net.osgg.util.HibernateUtil;

public class App {
    public static void main(String[] args) {

        Provincia prov1 =new  Provincia ("01","Azuay","Cuenca","010101 - 011551");
        Provincia prov2 =new  Provincia ("02","Bolivar","Guaranda","020101 - 020702");
        Provincia prov3 =new  Provincia ("03","Canar","Azogues","030101 - 030750");
        Provincia prov4 =new  Provincia ("04","Carchi","Tulcan","040101 - 040650");
        Provincia prov5 =new  Provincia ("05","Chimborazo","Riobamba","060101 - 060956");
        Provincia prov6 =new  Provincia ("06","Cotopaxy","Latacunga","050101 - 050754");
        Provincia prov7 =new  Provincia ("07","El Oro","Machala","070101 - 071452");
        Provincia prov8 =new  Provincia ("08","Esmeraldas","Esmeraldas","080101 - 080755");
        Provincia prov9 =new  Provincia ("20","Galapagos","Puerto Baquerizo Moreno","200102 - 200104");
        Provincia prov10 =new Provincia ("09","Guayas","Guayaquil","090101 - 092750");
        Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the object
            session.save(prov1);
            session.save(prov2);
            session.save(prov3);
            session.save(prov4);
            session.save(prov5);
            session.save(prov6);
            session.save(prov7);
            session.save(prov8);
            session.save(prov9);
            session.save(prov10);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }

        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            List < Provincia > provincias = session.createQuery(" from Provincia", Provincia.class).list();
            provincias.forEach(s -> System.out.println("    Código de la provincia :  " + s.getCodprovincia()+
            		                                    "   Nombre de la Provincia :  " + s.getNombreporvincia()+
            		                                    "   Capital de la provincia :  " + s.getCapital()+
            		                                    "   Código Postal :  " + s.getCodigopostal()));

        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}