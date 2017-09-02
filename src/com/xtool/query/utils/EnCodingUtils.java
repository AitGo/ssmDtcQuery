package com.xtool.query.utils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.UUID;


public class EnCodingUtils {
	
	private static String privateKeyPath = "D:\\file\\privateKey.cer";
	private static String keyName = "key";

	public static <T> void encoding(T t,String uuid) throws Exception {
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
					}else if (type.endsWith("int") || type.endsWith("Integer")) {
//						Integer i = (Integer)object;
//						String string = String.valueOf(i);
//						String encrypt = AESUtil.encrypt(string, uuid);
//						field.set(t, Integer.valueOf(encrypt));
					}
				}
			}
			
		}
		
	}

}
