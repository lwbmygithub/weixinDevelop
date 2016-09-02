package com.sunwah.baseapp.util;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

public class FileWriteRead {
	public FileWriteRead() {
	}

	/**
	 * ��ȡ�ļ�filePath��һ�е���ݣ�������������
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	public String ReadFileOneLine(String filePath) throws FileNotFoundException {
		String currentRecord = null;// �����ı��ı�
		// �����µ�BufferedReader����
		BufferedReader file = new BufferedReader(new FileReader(filePath));
		String returnStr = null;
		try {
			// ��ȡһ����ݲ����浽currentRecord����
			currentRecord = file.readLine();
		} catch (IOException e) {// ������
			System.out.println("��ȡ��ݴ���.");
		}
		if (currentRecord == null)
			// ����ļ�Ϊ��
			returnStr = "û���κμ�¼";
		else {// �ļ���Ϊ��
			returnStr = currentRecord;
		}
		// ���ض�ȡ�ļ������
		return returnStr;
	}

	/**
	 * ��ȡ�ļ��е���������
	 * 
	 * @param filePath
	 * @return
	 * @throws FileNotFoundException
	 */
	public String ReadFile(String filePath) throws Exception {

		// String picturefolderurl=readpro.prop.getProperty("picturefolderurl");

		File file = new File(filePath);
		BufferedReader reader = null;
		String laststr = "";
		try {
			// System.out.println("����Ϊ��λ��ȡ�ļ����ݣ�һ�ζ�һ���У�");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// һ�ζ���һ�У�ֱ������nullΪ�ļ�����
			while ((tempString = reader.readLine()) != null) {
				// ��ʾ�к�
				// System.out.println("line " + line + ": " + tempString);
				laststr = laststr + tempString;
				line++;
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return laststr;
	}

	public byte[] getBytesFromFile(File file) throws IOException {
		InputStream is = new FileInputStream(file);

		long length = file.length();

		if (length > Integer.MAX_VALUE) {
			// File is too large
		}

		byte[] bytes = new byte[(int) length];

		// Read in the bytes
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length
				&& (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}

		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			throw new IOException("Could   not   completely   read   file   "
					+ file.getName());
		}

		is.close();
		return bytes;
	}

	/**
	 * д�ļ����� дΪһ��
	 * 
	 * @param filePath
	 *            �ļ�·��
	 * @param tempcon
	 *            д�������
	 * @throws FileNotFoundException
	 */
	public void WriteFile(String filePath, String tempcon)
			throws FileNotFoundException {
		try {
			// ����PrintWriter��������д����ݵ��ļ���
			PrintWriter pw = new PrintWriter(new FileOutputStream(filePath));
			// ���ı���ʽ��ӡ����Writestr
			pw.println(tempcon);
			// ���PrintWriter����
			pw.close();
		} catch (IOException e) {
			// ������
			System.out.println("д���ļ�����" + e.getMessage());
		}
	}

	/**
	 * �ļ���д�� ��Ҫ���е��������������ʽ����
	 * 
	 * @param filePath(�ļ�·��)
	 * @param fileName(�ļ���)
	 * @param args[]
	 * @throws IOException
	 */
	public void WriteFile(String filePath, String[] args) throws IOException {
		FileWriter fw = new FileWriter(filePath);
		PrintWriter out = new PrintWriter(fw);
		for (int i = 0; i < args.length; i++) {
			out.write(args[i]);
			out.println();

		}
		fw.close();
		out.close();
	}

	/**
	 * �ж��ļ��Ƿ����
	 * 
	 * @return
	 */
	public boolean IsFileExists(String filePath) {

		File f = new File(filePath);

		if (f.exists()) {// ���File.txt�Ƿ����
			return true;
		} else {
			return false;
		}

	}

	/**
	 * �������ļ�
	 * 
	 * @param filePath
	 * @return
	 */
	public boolean CreateFile(String filePath) {
		boolean flag = true;
		File f = new File(filePath);

		if (f.exists()) {// ���File.txt�Ƿ����
			f.delete();
			try {
				f.createNewFile();
			} catch (IOException e) {
				flag = false;
			}
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				flag = false;
			}

		}
		return false;

	}

	/**
	 * ��Ҫд����ַ�д���ļ�����
	 * 
	 * @param str
	 *            Ҫд�������
	 * @param destFilePath
	 *            Ŀ���ļ���ַ
	 * @throws Exception
	 */
	public static void writefilewithmqhxhtm(String str, String destFilePath)
			throws Exception {
		File temp = new File(destFilePath);
		DataOutputStream outs = new DataOutputStream(new FileOutputStream(temp));
		outs.write(str.getBytes());
		outs.close();

	}

	/*
	 * ������һ���������4����javaӦ�ó���4��ȡ�ļ�����ǰ���"//"ȥ�����������У�java
	 * FileRw 4���ԡ�
	 */
	public static void main(String args[]) throws Exception {
		FileWriteRead fm = new FileWriteRead();
		String inFile = "c:\\test.html";
		String outFile = "c:\\test1.html";

		String content = fm.ReadFile(inFile);

		try {
			fm.WriteFile(outFile, content);
		} catch (IOException e) {
			// TODO �Զ���� catch ��
			e.printStackTrace();
		}
	}
}
