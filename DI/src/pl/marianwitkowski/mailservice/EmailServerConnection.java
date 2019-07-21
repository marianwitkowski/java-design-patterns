package pl.marianwitkowski.mailservice;

public class EmailServerConnection {
    private String hostname;
    private String username;
    private String password;
    private int portNumber;
    private String authType;
    private int timeout;

    public EmailServerConnection(String hostname, String username, String password, int portNumber, String authType, int timeout) {
        this.hostname = hostname;
        this.username = username;
        this.password = password;
        this.portNumber = portNumber;
        this.authType = authType;
        this.timeout = timeout;
    }

    public void connect() {
        System.out.println("Connecting to SMTP server");
    }

}
