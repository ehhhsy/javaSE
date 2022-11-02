package demo68;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/*
* java.util.Properties extends HashTable<k,v> implements Map<k,v>
  Properties ���ʾ��һ���־õ����Լ���Properties �ɱ��������л�����м��ء�

  * Properties������Ψһ��IO����ϵļ���
  *     ����ʹ��Properties�����е�store���Ѽ����е���ʱ����,�־û���Ӳ����
  *     ����ʹ��Properties�����е�load����Ӳ���б�����ļ�(����ֵ),��ȡ��������ʹ��
  *
  * �����б���ÿ���������Ӧֵ����һ���ַ�����
  *     Properties������һ��˫�м��ϣ�key��valueĬ�����ַ���
  *
* */
public class Demo04properties {
    public static void main(String[] args) {
        show01();

    }
        /**
         ʹ��Properties���ϴ洢���ݣ�����Properties�����е�����
         Properties������һЩ�����ַ����ķ���
         Object setProperty(String key, String value) ���� Hashtable �ķ��� put��
         String getProperty(String key) ��ͨ��Key�ҵ�Value   === map���ϵ�get(key)����
         set< String> stringPropertyNames()  ���ش������б��еļ��������иü������Ӧֵ���ַ�����  === map������keySet()����
         */
    private static void show01() {
        Properties properties = new Properties();
        // ����setProperty���� ���Ԫ��
        properties.setProperty("���ෲ","5000");
        properties.setProperty("������","6000");
        properties.setProperty("���׷�","7000");

        //stringPropertyNames()��keyȡ������set������  === map������keySet()����
        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            System.out.println(key+"=="+properties.getProperty(key));
        }
    }
}
