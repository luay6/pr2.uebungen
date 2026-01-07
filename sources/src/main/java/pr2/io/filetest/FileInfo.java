package pr2.io.filetest;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileInfo {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get(args[0]);
        if(Files.exists(path)) {
            System.out.println(path + " existiert");
        }
        else {
            System.out.println(path + " existiert nicht");
        }
        long size = Files.size(path);
        System.out.println(path + " " +  size + " Byte groß");
        if(Files.isDirectory(path)) {
            System.out.println(path + " ist Verzeichnis");
        }
        else {
            System.out.println(path + " ist Datei");
        }
        
        if(Files.isReadable(path)) {
            System.out.println(path + " darf gelesen werden");
        }
        else {
            System.out.println(path + " darf nicht gelesen werden");
        }
        if(Files.isWritable(path)) {
            System.out.println(path + " darf geschrieben werden");
        }
        else {
            System.out.println(path + " darf nicht geschrieben werden");
        }
    }
}
