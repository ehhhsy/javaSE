package Demo65.test2022;

import java.io.File;
import java.io.FileFilter;

public class FilefilterImpl implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        if (pathname.isDirectory()){
            return true;
        }
        return pathname.toString().endsWith(".java");
    }
}
