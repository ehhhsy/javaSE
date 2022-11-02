package Demo65.test2022;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Locale;

public class FilenameFilterImpl implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {

            return new File(dir,name).isDirectory() || name.toLowerCase().endsWith(".java");
    }
}
