package pl.javacd.drive;

import pl.javacd.File;

public interface Drive {
    void addFile(File file);
    void listFiles();
    File findFile(String name);
}
