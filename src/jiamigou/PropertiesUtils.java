package jiamigou;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesUtils {
 /**
  * ???? 2006 2006-8-18 ????01:40:49
  * 得到文件的输入流
  **/
 private static Properties file = new Properties();  
 public void getFile(String fileName){
//  Resource resource=new ClassPathResource(fileName);
  InputStream inputStream = getClass().getResourceAsStream("/"+fileName);
  if(inputStream==null){
   System.out.println(fileName+" is  exist!");
  }
  else{
   try {
    file.load(inputStream);
    inputStream.close();
   } catch (IOException e) {
    e.printStackTrace();
   }
  }
 }
 /**
  * @param propertyName  读取 和写入
  * @return  key
  */
 public String read(String propertyName){
  return  file.getProperty(propertyName);
 }
 public void write(String name,String value){
  file.setProperty(name, value);
 }
 
 /**
  * 关闭文件
  */
 public void close(){
  try {
   OutputStream os=new FileOutputStream("jdbc.properties");
   file.store(os,null);
   /*OutputStream os=new FileOutputStream("src/jdbc.xml");
   prop.storeToXML(os,null);*/
   os.close();
  }catch (Exception e) {
   System.out.println("jdbc.properties无法正常关闭");
  }
 }
 /**
  * 测试
  */
 public static void main(String[] args){
  PropertiesUtils util = new PropertiesUtils();
  util.getFile("jdbc.properties");
  util.write("jdbc.port","10080");
  util.write("jdbc.username","9999");
  util.close();
  String value=util.read("jdbc.url");
  System.out.println("value-->"+value);
 }
}