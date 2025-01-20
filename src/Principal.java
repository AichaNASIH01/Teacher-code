import java.util.Iterator;
import java.util.Scanner;

import java_esi.interfaces.IArticle;
import java_esi.interfaces.Stylo;
import java_esi.interfaces.cartables.*;

public class Principal {

    public static void main(String[] args) {
        // Main method serves as the entry point of the application.

        if (args.length == 2) { // Check if exactly two arguments are provided.

            // Iterate over arguments (example usage placeholder, currently does nothing).
            for (String string : args) {
                // Placeholder loop - could be used for argument validation or processing.
            }

            // Print each argument with its index.
            for (int i = 0; i < args.length; i++) {
                System.out.println("argument " + i + ":" + args[i]);
            }

            // Create a Scanner object to read input from the console.
            Scanner scan = new Scanner(System.in);
            String message = scan.nextLine(); // Read a line of input.
            System.out.println("message saisie au clavier:" + message);

            // Creating an instance of Stylo (a type of IArticle).
            IArticle article = new Stylo("stylo bic", 20);

            // Display article details and perform stock operations.
            System.out.println(" la description de l'article est: " + article.getDescription());
            System.out.println(" la qte initiale en stock de cet article est :" + article.getQte());

            article.ajouterQte(10); // Add 10 to the stock.
            System.out.println(" la qte en stock après approvisionnement :" + article.getQte());

            article.retirerQte(20); // Remove 20 from the stock.
            System.out.println(" la qte en stock après vente :" + article.getQte());

            // Creating an instance of Cartable (another type of IArticle).
            IArticle a2 = new Cartable("abidass", 15, "50L comme capacité imperméable");

            // Display cartable details and perform stock operations.
            System.out.println(" la description de l'article est: " + a2.getDescription());
            System.out.println(" la qte initiale en stock de cet article est :" + a2.getQte());

            a2.ajouterQte(10); // Add 10 to the stock.
            System.out.println(" la qte en stock après approvisionnement :" + a2.getQte());

            a2.retirerQte(20); // Remove 20 from the stock.
            System.out.println(" la qte en stock après vente :" + a2.getQte());

        } else {
            // Display an error message if the required number of arguments is not provided.
            System.out.println("erreur!!! vous devez me fournir deux parametres");
        }
    }
}
