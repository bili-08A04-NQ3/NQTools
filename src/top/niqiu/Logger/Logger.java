package top.niqiu.Logger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private final String runPath;

    public Logger() {
        this.runPath = System.getProperty("user.dir") + "\\Logs\\";
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String title = format.format(date);
        File file = new File(runPath);
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public void log(Object o) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String title = format.format(date);
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(runPath + title + ".log", true)));
            String s = "[" + title + "][Main/Info] " + o;
            writer.write(s);
            System.out.println(s);
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
