package pl.marianwitkowski;

public class CsharpChordDecorator {

    private CsharpChord chord;

    public CsharpChordDecorator(CsharpChord chord) {
        this.chord = chord;
    }

    public void play() {
        System.out.println("===== CsharpChordDecorator ====");
        chord.play();
        chord.playSound("B-flat"); //play C7 chord
    }
}



