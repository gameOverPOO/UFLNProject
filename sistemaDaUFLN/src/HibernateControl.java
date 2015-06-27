
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;



public class HibernateControl {
     private final SessionFactory factory;
    public HibernateControl(){
        this.factory =  new AnnotationConfiguration().configure().buildSessionFactory();
    }
    public Session getSession(){
        return factory.openSession();
    }
    
}
