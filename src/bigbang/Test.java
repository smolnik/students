package bigbang;

/**
 * @author ASmolnik
 * 
 * Noncompliant code example - MET05-J rule violation
 * 
 * @see https://www.securecoding.cert.org/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods 
 *
 */

public class Test {

    public static void main(String[] args) {
        //Connection connection = new Connection();
        //connection.connect();

        //Connection maliciousConnection = new MaliciousConnection();
        //maliciousConnection.connect();

        Connection badConnection = new BadlyInitializedConnection();
        //badConnection.connect();

        //System.out.println("\n");
        //Connection badConnection1 = new BadlyInitializedConnection();
        //badConnection.connect();

    }

}
