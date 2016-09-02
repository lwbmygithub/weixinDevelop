package com.sunwah.baseapp.weixin.util;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.imageio.ImageIO;

public class ImageUtil {
	
	 
	public static void saveImage(InputStream inputStream,  String fileName) {  
	  
		   byte[] data = new byte[1024 * 1000];

	       int len = 0;

	       FileOutputStream fileOutputStream = null;

	       try {

	           fileOutputStream = new FileOutputStream(fileName);

	           while ((len = inputStream.read(data)) != -1) {

	               fileOutputStream.write(data, 0, len);

	           }

	       } catch (IOException e) {

	           e.printStackTrace();

	       } finally {

	           if (inputStream != null) {

	               try {

	                   inputStream.close();

	               } catch (IOException e) {

	                   e.printStackTrace();

	               }

	           }

	           if (fileOutputStream != null) {

	               try {

	                   fileOutputStream.close();

	               } catch (IOException e) {

	                   e.printStackTrace();

	               }

	           }

	       }
	}  
	  
	
}
