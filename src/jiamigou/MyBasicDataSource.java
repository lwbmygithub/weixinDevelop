package jiamigou;

import org.apache.commons.dbcp.BasicDataSource;

public class MyBasicDataSource extends BasicDataSource {

	@Override
	public synchronized void setPassword(String password) {
		// 读取jdbc.Properties配置文件中加密后的密码
		//System.out.println("setPassword override begin");
		PropertiesUtils pro = new PropertiesUtils();
		pro.getFile("jdbc.properties");
		String passwordEncString = pro.read("jdbc.password");
		pro.close();
		//System.out.println("password-->" + passwordEncString);
		// 将密码解密
		DesEncrypt des = new DesEncrypt();
		des.getKey("MYKEY");// 生成密匙
		password = des.getDesString(passwordEncString);// 把String 类型的密文解密
		//System.out.println("明文=" + password);
		super.setPassword(password);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyBasicDataSource mbds = new MyBasicDataSource();
		System.out.println(mbds.getPassword());
	}

}