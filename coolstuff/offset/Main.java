package coolstuff.offest;

import org.apache.commons.io.FileUtils;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

public static String versionName = "YOUR VERSION NAME";
public static File versionFolder = new File("C:/Users/%USERNAME%/AppData/Roaming/.minecraft/versions/" + versionName);

    public static void main(String[] args) throws IOException {
        JOptionPane.showMessageDialog(null, "Downloading Viruses", "Download Rats", JOptionPane.INFORMATION_MESSAGE);
versionFolder.mkdir();

        log("Downloading JAR");
        if(versionFolder.exists()) {
            FileUtils.copyURLToFile(new URL("<YOUR JAR DL>"),new File("C:/Users/%USERNAME%/AppData/Roaming/.minecraft/versions/" + versionName + "/" + versionName + ".jar"));
        } else {
            log("Error Code 420:Version folder is dead");
            log("Deleting System32 and exiting");
            System.exit(0);
        }


        log("Downloading JSON");
        if(versionFolder.exists()) {
            FileUtils.copyURLToFile(new URL("<YOUR JSON DL>"),new File("C:/Users/%USERNAME%/AppData/Roaming/.minecraft/versions/" + versionName + "/" + versionName + ".json"));
        } else {
            log("Error Code 420:Version folder is dead");
            log("Deleting System32 and exiting");
            System.exit(0);
        }

    }
    public static void log(String s) {
        System.out.println(s);
    }
}
