package com.sun.zq;

import java.io.IOException;
import java.io.InputStream;

public class MyClassLoader extends ClassLoader {

	public static void main(String[] args) {
		MyClassLoader myLoader = new MyClassLoader();
		try {
			Object obj = myLoader.loadClass("com.sun.zq.MyClassLoader").newInstance();
			System.out.println(obj.getClass().getClassLoader().getParent());
			System.out.println(obj.getClass().getClassLoader().getParent().getParent());
			System.out.println(obj.getClass().getClassLoader().getParent().getParent().getParent());
			System.out.println(obj);
			System.out.println(obj instanceof com.sun.zq.MyClassLoader);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public Class<?> loadClass(String name) throws ClassNotFoundException {
		String filename = name.substring(name.lastIndexOf(".") + 1)+".class";
		InputStream is = getClass().getResourceAsStream(filename);
		if (is == null) {
			return super.loadClass(name);
		}
		try {
			byte[] b = new byte[is.available()];
			is.read(b);
			return defineClass(name, b, 0, b.length);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return super.loadClass(name);
	}
}
