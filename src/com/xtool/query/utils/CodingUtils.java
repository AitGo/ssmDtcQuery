package com.xtool.query.utils;

import java.lang.reflect.Field;

/**
 * Created by xtool on 2017/9/2.
 */

public class CodingUtils {

    private static String keyName = "key";
    
    private static String privateKeyPath = "D:\\file\\privateKey.cer";

	public static <T> void encodingByPrivateKey(T t,String uuid) throws Exception {
		Class<? extends Object> clazz = t.getClass();
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields) {
			field.setAccessible(true);
			Object object = field.get(t);
			if(object != null && !object.equals("")) {
				if(field.getName().equals(keyName)) {
					//RSA
					String privateKey = RSAUtils.getKey(privateKeyPath);
					byte[] endata = RSAUtils.encryptByPrivateKey(uuid.getBytes(), privateKey);
					String encode = Base64Utils.encode(endata);
					field.set(t, encode);
				}else {
					//AES
					//判断类型
					String type = field.getType().toString();
					if(type.endsWith("String")) {
						String encrypt = AESUtil.encrypt(object.toString(), uuid);
						field.set(t, encrypt);
					}
				}
			}
		}
	}
	

    public static <T> void DeCoding(T t, String uuid) throws Exception {
        Class<? extends Object> clazz = t.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            Object object = field.get(t);
            if (object != null && !object.equals("")) {
                if (!field.getName().equals(keyName)) {
                    //AES
                    //判断类型
                    String type = field.getType().toString();
                    if (type.endsWith("String")) {
                        String encrypt = AESUtil.decrypt(object.toString(), uuid);
                        field.set(t, encrypt);
                    } 
                }
            }
        }
    }
}
