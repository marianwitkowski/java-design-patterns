package pl.marianwitkowski;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RealTextFile implements TextFile {

    private String fileName;
    private String content = "";

    public RealTextFile(String fileName){
        this.fileName = fileName;
        try {
            content = loadFromDisk(fileName);
        } catch (Exception exc) {
            content = null;
        }
    }

    @Override
    public void print() {
        if (content!=null) {
            System.out.println(content);
        }
    }

    private String loadFromDisk(String fileName) throws IOException {
        System.out.println("Loading " + fileName);
        String result = new String(Files.readAllBytes(Paths.get(fileName)),
                StandardCharsets.UTF_8).trim();
        return result;
    }
}


