import com.karine.Animal.Chien;
import com.karine.Animal.Loup;
import com.karine.Animal.Rintintin;

public class AnimalTest {
    public static void main(String[] args) {
      Loup l = new Loup("Gris bleuté", 20);
      l.boire();
      l.manger();
      l.deplacement();
      l.crier();
      System.out.println(l.toString());

      //Les methodes d'un chien
      Chien c = new Chien("Gris bleuté", 20);
      c.boire();
      c.manger();
      c.deplacement();
      c.crier();
      System.out.println(c.toString());

      System.out.println(".....................................");
      //Les méthodes de l'interface
      c.faireCalin();
      c.faireLeBeau();
      c.faireLechouille();

      System.out.println("....................................");
      //Utilisons le polymorphisme de notre interface
      Rintintin r = (Rintintin) new Chien();
      r.faireLeBeau();
      r.faireCalin();
      r.faireLechouille();
    }
}
