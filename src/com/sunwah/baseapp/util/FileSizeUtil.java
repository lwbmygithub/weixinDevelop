package com.sunwah.baseapp.util;

import java.io.File;

public class FileSizeUtil {
	
	public static double getDirSize(File file){
		if(file.exists())
		{
			if(file.isDirectory())
			{
				File[]	children=file.listFiles();
				double size=0.0;
				for(File f :children)
					size+=getDirSize(f);
				return size;
			}else{
				
				double size=(double)file.length()/1024/1024;//兆
				return  size;
			}
			
			
		}else
		{
			
			System.out.println("文件或者文件夹不存在");
			return 0.0;
		}
		
	}

}
