package test;

import java.io.File;
import java.io.FileFilter;

public class FilefilterIMPL implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        for (File file : pathname.listFiles()) {
            if (file.isDirectory()) {
                accept(file);
            }

        }
        return true;
    }
}
