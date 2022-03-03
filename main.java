import model.Usuario;

import javax.persistence.*;

public class Main {


    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.setLogin("admin");
        usuario.setSenha("123");


        EntityManager manager = JpaUtil.getEntityManager();
        EntityTransaction entityTransaction = manager.getTransaction();
        entityTransaction.begin();
        manager.persist(usuario); 
        entityTransaction.commit();


    manager.close();
    JpaUtil.close();


    }
}
