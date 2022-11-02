package Demo65;

import java.io.File;
import java.io.FileFilter;
        //过滤器
public class Demo11 implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        过滤的规则：
        在accept方法中，判断File对象是否以。java结尾
        是就返回true
        不是就返回false
         */
        if (pathname.isDirectory()){//文件夹也不放过
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
