package bigbang;

/**
 * @author ASmolnik
 * 
 * Noncompliant code example - MET05-J rule violation
 * 
 * @see https://www.securecoding.cert.org/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods 
 *
 */
public class BadlyInitializedConnection extends Connection {

    static {
        System.out.println("enter step 1a.");
    }

    {
        System.out.println("enter step 3a.");
    }

    private Url url = new Url("http://google.pl");

    public BadlyInitializedConnection() {
        System.out.println("enter step 4.");
        this.url = getUrl();
        System.out.println("this.url from BadlyInitializedConnection: " + url);
    }

    @Override
    public Url getUrl() {
        return url;
    }

}
