package bigbang;

/**
 * @author ASmolnik
 * 
 * Noncompliant code example - MET05-J rule violation
 * 
 * @see https://www.securecoding.cert.org/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods 
 *
 */
public class Connection {

    static {
        System.out.println("enter step 1.");
    }

    {
        System.out.println("enter step 2.");
    }

    private Url url;

    /**
     * 
     * Never, never do it! Do not call a public non-final (overridable) method from a constructor! Never!
     *
     */
    public Connection() {
        System.out.println("enter step 3.");
        this.url = this.getUrl();
        System.out.println("this.url from Connection: " + url);
    }

    public Url getUrl() {
        return new Url("http://altkom.pl");
    }

    public void connect() {
        url.openConnection();
        System.out.println("Connection to " + url + " established");
    }

}
