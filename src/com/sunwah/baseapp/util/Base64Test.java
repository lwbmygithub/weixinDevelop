package com.sunwah.baseapp.util;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.imageio.ImageIO;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64Test 
{
    public static void main(String[] args)
    {
        String strImg = GetImageStr();
        System.out.println(strImg);
    //  GenerateImage(strImg,"d://test1",".jpg");
    }
    public static String GetImageStr()
    { 
        String imgFile = "d://test.jpg";// 
        InputStream in = null;
        byte[] data = null;
        
        try 
        {
            in = new FileInputStream(imgFile);        
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
         
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data); 
    }
    
     
    public static boolean GenerateImage(String imgStr,String dir,String prfix,String login_name)
    {    
        if (imgStr == null)  
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try 
        {
             
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                { 
                    b[i]+=256;
                }
            }
           
            String imgFilePath =dir+File.separator+login_name+prfix;//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);    
          
            out.write(b);
            out.flush();
            out.close();
            
            BufferedImage prevImage = ImageIO.read(new File(imgFilePath));
            Double width =(double) prevImage.getWidth();  
            Double height =(double) prevImage.getHeight(); 
            System.out.print(width);
            if(width>120.0)
			{
				width=120.0/width*width;
				height=120.0/width*height;
			}
	        else
			{
				width=120.0;
			}
            ImageUtil.resize(new File(imgFilePath), new File(imgFilePath), width.intValue(), 1f);
            
            
         /*   BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_BGR);
            Graphics graphics = image.createGraphics();
            graphics.drawImage(prevImage, 0, 0, newWidth, newHeight, null);  
            OutputStream out1 = new FileOutputStream("d://test3.jpg");    
            ImageIO.write(image, "jpeg", out1); 
            out1.close();*/
           
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
}

