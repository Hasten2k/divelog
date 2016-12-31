import com.divelog.model.Dive;
import com.divelog.model.DiveSite;
import com.divelog.model.User;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
      User carl = new User("cstalhem", "Carl","Stalhem", "carl@stalhem.se");

      DiveSite elphinstone = new DiveSite("Elphinstone Reef", "Egypt");

      Dive dive = new Dive(elphinstone, new Date(1480329953000L), 40, 35);

      carl.getLogBook().addDive(dive);

      String log = carl.getLogBook().toString();

      System.out.println(log);
    }
}
