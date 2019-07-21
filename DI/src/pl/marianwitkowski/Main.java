package pl.marianwitkowski;

import pl.marianwitkowski.session.Session;
import pl.marianwitkowski.session.User;

public class Main {

    public static void main(String[] args) {

        Session session = new Session();
        System.out.println("Token = "+ session.getToken());

        User user = new User(session);

        user.setName("Jan Kowalski");
        System.out.println("User = " + user.getName());

    }
}
