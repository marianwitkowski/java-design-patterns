package pl.marianwitkowski;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleLogger {

    private static SimpleLogger logger = null;

    private PrintWriter writer;

    private SimpleLogger() {
        try {
            String property = "user.home";
            String tempDir = System.getProperty(property);
            Path path = Paths.get(tempDir, "logger.txt");
            String logFile = path.toString();
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized SimpleLogger getInstance() {
        if (logger == null) {
            logger = new SimpleLogger();
        }
        return logger;
    }

    public void info(String s) {
        this.write("INFO:"+s);
    }

    public void debug(String s) {
        this.write("DEBUG:"+s);
    }

    public void error(String s) {
        this.write("ERROR:"+s);
    }

    public void fatal(String s) {
        this.write("FATAL:"+s);
    }

    private void write(String s) {
        Date now = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ"); //ISO 8601
        String nowStr = simpleDateFormat.format(now);
        writer.println(nowStr+" - "+s);
    }

}
