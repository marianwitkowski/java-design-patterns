package pl.marianwitkowski;

public class Main {

    public static void main(String[] args) {

        TextFile textFile = new ProxyTextFile("/Users/marian/Downloads/hello.txt");

        for (int i=0;i<5;i++) {
            System.out.println("========================");
            textFile.print();
        }

    }
}
