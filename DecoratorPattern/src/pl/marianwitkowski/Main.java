package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        CsharpChord csharpChord = new CsharpChord();
        CsharpChordDecorator decorator = new CsharpChordDecorator(csharpChord);
        decorator.play();

    }
}
