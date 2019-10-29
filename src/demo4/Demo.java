package demo4;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.text.NumberFormat;
import java.util.*;

public class Demo {
    public static final String string = "d:\\e\\test\\";
    public static void main(String[] args) throws IOException {
       /* Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date.getTime());
        System.out.println(String.valueOf(date.getTime()).substring(0,String.valueOf(date.getTime()).length()-3));
        System.out.println("==========================");
        Map<String ,Object> map = new HashMap();
        map.put("aa","aa");
        map.put("bb","bb");
        map.put("cc","cc");
        map.put("dd","dd");
        for (Map.Entry<String,Object> stringObjectEntry : map.entrySet()){
            System.out.println(stringObjectEntry.getKey()+":"+stringObjectEntry.getValue());
        }
        System.out.println(new Date().getTime());*/
      /*  Double d = 123456.99847;
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        System.out.println(numberFormat.getMaximumFractionDigits());
        System.out.println(numberFormat.format(d));
        System.out.println("===========");
        numberFormat.setMaximumFractionDigits(4);
        System.out.println(numberFormat.format(d));
        numberFormat.setMaximumFractionDigits(0);
        System.out.println(numberFormat.format(d));
        numberFormat.setMaximumFractionDigits(-1);
        System.out.println(numberFormat.format(d));
        numberFormat.setMaximumFractionDigits(8);
        numberFormat.setMinimumFractionDigits(8);
        numberFormat.setMaximumIntegerDigits(8);
        numberFormat.setMinimumIntegerDigits(8);
        System.out.println(numberFormat.format(d));
System.out.println((int)((Math.random()*9+1)*100000));*/
 /*       Map<String, Object> stringObjectMap = new HashMap<>();
        stringObjectMap.put("qq", "qq");
        stringObjectMap.put("1", 1);
        stringObjectMap.put("2", 2);
        stringObjectMap.put("3", "3");
        Set<String> strings = stringObjectMap.keySet();
        for (String s : strings){
            System.out.println("key="+s+"value="+stringObjectMap.get(s));
        }
        for (Map.Entry<String, Object> stringObjectEntry : stringObjectMap.entrySet()) {
            System.out.println("key=" + stringObjectEntry.getKey() + ",value=" + stringObjectEntry.getValue());
        }*/
 /*String s = "123456789999" ;
 s=s.substring(s.length()-6);
    System.out.println(s);*/
      /*  File file = new File("d:\\javaaaa\\test");
        Boolean aBoolean  = file.exists();
        System.out.println(aBoolean);
        Boolean aBoolean1 = file.mkdirs();
        System.out.println(aBoolean1);
*/
        /*
        File file1 = new File("d:\\javaaaa\\test\\a.txt");
        Boolean aBoolean3 = file1.exists();
        System.out.println(aBoolean3);
        Boolean aBoolean = file1.renameTo(new File("d:\\eeee\\b.txt"));
        System.out.println(aBoolean);*/
      /*  File file = new File("d:\\ee\\c.txt");
        if (file.exists()){
            System.out.println("存在");
        }else{
            Boolean aBoolean = file.createNewFile();
            if (aBoolean){
                System.out.println("创建成功！！");
            }else {
            System.out.println("创建失败！！");
        }
        }
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\ee\\c.txt");
        String s = "丰富苏珀尔空格靠谱的";
        byte[] bytes = s.getBytes();
        fileOutputStream.write(bytes);*/
/*       FileInputStream fis = new FileInputStream("d:\\ee\\c.txt");
        StringBuilder sb = new StringBuilder();
        byte[] buf = new byte[1024]; //字节数组缓存数据
        int n = 0; //记录读取的字节长度
        //循环读取数据
        while((n = fis.read(buf)) != -1){
            //这里使用三个参数的构造方法，因为最后一次读取的长度可能达不到buf数组的长度
            //所以根据实际读取的长度n去构造对象更合理
            sb.append(new String(buf, 0, n));
            buf = new byte[1024]; //重新初始化，避免数据重复
        }
        System.out.println(sb.toString());*/
       /* String s = (new Date().getTime()/1000)+".jpg";
        File file = new File(string+s);
        System.out.println(file.exists());
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        FileInputStream fileInputStream = new FileInputStream("d:\\image\\111.jpg");
        byte[] bytes = new byte[2048];
        int i = 0;
        while ((i=fileInputStream.read(bytes))!=-1){
            fileOutputStream.write(bytes,0,i);
        }
        fileInputStream.close();
        fileOutputStream.close();*/

    }

}
 /*   }
}*/
