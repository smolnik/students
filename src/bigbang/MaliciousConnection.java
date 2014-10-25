package bigbang;

/**
 * @author ASmolnik
 * 
 * Noncompliant code example - MET05-J rule violation
 * 
 * @see https://www.securecoding.cert.org/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods 
 *
 */
public class MaliciousConnection extends Connection {

    @Override
    public Url getUrl() {
        return null;
    }
}
