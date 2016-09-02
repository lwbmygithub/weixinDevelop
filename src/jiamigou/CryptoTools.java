package jiamigou;

import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

import flex.messaging.util.URLEncoder;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;


/**
 * 使用DES加密和解密的方法
 * @author:azhong
 *User: Administrator
 * Date: 2007-10-27
 * Time: 10:54:36
 *  */
public class CryptoTools {
    private final byte [] DESkey = {'B','D','L','G','2','4','6','8'};//设置密钥，略去		//BDLG2468
    private final byte[] DESIV = { 'a', 'b', 'c','d','e','f','g','h'};//设置向量，略去

   // private final byte[] DESIV = {'[','B','@','6','1','a','8','a','9','e','7'};//设置向量，略去
    
    
    private  AlgorithmParameterSpec iv =null;//加密算法的参数接口，IvParameterSpec是它的一个实现
    private  Key key =null;


    public CryptoTools() throws  Exception {
         DESKeySpec keySpec = new DESKeySpec(DESkey);//设置密钥参数
         iv = new IvParameterSpec(DESIV);//设置向量
         SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");//获得密钥工厂
         key = keyFactory.generateSecret(keySpec);//得到密钥对象

    }

    public String encode(String data) throws Exception {
        Cipher enCipher  =  Cipher.getInstance("DES/CBC/PKCS5Padding");//得到加密对象Cipher
        enCipher.init(Cipher.ENCRYPT_MODE,key,iv);//设置工作模式为加密模式，给出密钥和向量
        byte[] pasByte = enCipher.doFinal(data.getBytes("utf-8"));
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(pasByte);
    }

    public  String decode(String data) throws Exception{
        Cipher deCipher   =  Cipher.getInstance("DES/CBC/PKCS5Padding");
        deCipher.init(Cipher.DECRYPT_MODE,key,iv);
           BASE64Decoder base64Decoder = new BASE64Decoder();

        byte[] pasByte=deCipher.doFinal(base64Decoder.decodeBuffer(data));

        return new String(pasByte,"UTF-8");
    }
    
    
    public static void main(String[] args) throws Exception {
    	
		System.out.println("des demo");
		CryptoTools des = new CryptoTools();// 实例化一个对像
		//des.getKey("BDLG2468");// 生成密匙
		System.out.println("key=MYKEY");
		String strEnc = des.encode("111111");// 加密字符串,返回String的密文
		System.out.println("密文=" + strEnc);
		System.out.println(URLEncoder.encode(strEnc, "UTF-8"));
		
		String strDes = des.decode(strEnc);// 把String 类型的密文解密
		System.out.println("明文=" + strDes);
	}
}
