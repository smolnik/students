package bigbang;

/**
 * @author ASmolnik
 * 
 * Noncompliant code example - MET05-J rule violation
 * 
 * @see https://www.securecoding.cert.org/confluence/display/java/MET05-J.+Ensure+that+constructors+do+not+call+overridable+methods 
 *
 */
public class Url {

    private String address;

    public Url(String address) {
        this.address = address;
    }

    public void openConnection() {
        System.out.println("Opening connection to " + address + "...");
    }

    @Override
    public String toString() {
        return "Url [address=" + address + "]";
    }

}
