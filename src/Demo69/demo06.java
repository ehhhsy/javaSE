package Demo69;


import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

/*
    对出师表进行排序
 */
public class demo06 {
    public static void main(String[] args) throws IOException {
        //创建输入输出缓冲流,指向目的地
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\tmp\\input\\chushibiao.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\tmp\\input\\出师表_排序后22.txt"));
        //创建保存一个hashmap文本, key(1,2,3,4...)  value(文本...)
        HashMap<String, String> hashMap = new HashMap<>();

        String line;
        while ((line=bufferedReader.readLine())!=null){
            //切割文本
            String[] split = line.split("\\.");
            hashMap.put(split[0],split[1]);
        }
        
        //遍历map集合,组装字符串
        for (String key : hashMap.keySet()) {
            String value = hashMap.get(key);
            line=key+"."+value;
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        bufferedReader.close();
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\tmp\\input\\chushibiao.txt"));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("D:\\tmp\\input\\出师表_排序后.txt"));
//        HashMap<Integer, String> hashMap = new HashMap<>();
//        String line;
//        while ((line=bufferedReader.readLine())!=null){
//            String[] split = line.split("\\.");
//            String tmp2=split[0];
//            hashMap.put(Integer.valueOf(tmp2),split[1]);
//        }
//        Set<Integer> keySet = hashMap.keySet();
//        for (Integer integer : keySet) {
//            line =(integer + "." + hashMap.get(integer));
//            bufferedWriter.write(line);
//            bufferedWriter.newLine();
//        }
//        bufferedWriter.close();
//        bufferedReader.close();
    }
}
