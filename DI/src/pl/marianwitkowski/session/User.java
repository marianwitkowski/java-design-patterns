package pl.marianwitkowski.session;

public class User {

    private Session session;

    public User(Session session) {
        this.session = session;
    }

    public void setName(String name) {
        session.set("name", name);
    }

    public String getName() {
        return session.get("name");
    }

}
