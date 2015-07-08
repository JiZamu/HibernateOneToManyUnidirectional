package unionetomany;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import unionetomany.model.Libro;
import unionetomany.model.Persona;

public class UniOneToMany {

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setTitulo("Java a fondo");
        Libro libro2 = new Libro();
        libro2.setTitulo("Android para todos");
        Libro libro3 = new Libro();
        libro3.setTitulo("Shell linux");
        Libro libro4 = new Libro();
        libro4.setTitulo("Vision por computadora");
        
            
        Persona persona1 = new Persona();
        persona1.setNombre("Eduardo Jimenez");
        persona1.addlibro(libro1);
        persona1.addlibro(libro2);
        
        Persona persona2 = new Persona();
        persona2.setNombre("Javier Jimenez");
        persona2.addlibro(libro3);
        persona2.addlibro(libro4);
        
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction trans = session.beginTransaction();
        session.save(persona1);
        session.save(persona2);
        Persona per = (Persona)session.get(Persona.class, 1);
        System.out.println("Nombre: "+per.getNombre());
        List<Libro> libros = per.getLibros();
        for(Libro l: libros){
            System.out.println("Titulo: "+l.getTitulo());
        }
        per.setNombre("Guadaupe Colin");
        session.delete(per);
        trans.commit();
        session.close();
    }
    
}
