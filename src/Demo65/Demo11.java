package Demo65;

import java.io.File;
import java.io.FileFilter;
        //������
public class Demo11 implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        /*
        ���˵Ĺ���
        ��accept�����У��ж�File�����Ƿ��ԡ�java��β
        �Ǿͷ���true
        ���Ǿͷ���false
         */
        if (pathname.isDirectory()){//�ļ���Ҳ���Ź�
            return true;
        }
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
