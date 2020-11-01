import java.io.File;

public class Io {
    public static void main(String[] args) {
        String dirName = "/home/dmint/Desktop/io";
        File dir = new File(dirName);
        if (!dir.exists())
            dir.mkdir();
    }
}
