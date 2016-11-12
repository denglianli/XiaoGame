package org.redstone.protobuf.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Proto2Code {

	public static void genByBat(String type) {
		String batPath = System.getenv("git_path");
		if("client".equalsIgnoreCase(type)){
			batPath += "/XiaoGame/XiaoGameServer/src/main/resources/serverGen/serverGen.bat";
		}else{
			batPath += "/XiaoGame/XiaoGameServer/src/main/java/org/redstone/protobuf/proto/clientGen.bat";
		}
		String command = "cmd.exe /c " + batPath;
		Process process = null;
		try {
			System.out.println(command);
			process = Runtime.getRuntime().exec(command);

			// ��ȡ���̵ı�׼������
			final InputStream is1 = process.getInputStream();
			// ��ȡ���ǵĴ�����
			final InputStream is2 = process.getErrorStream();
			// ���������̣߳�һ���̸߳������׼���������һ���������׼������
			new Thread() {
				public void run() {
					BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));
					try {
						String line1 = null;
						while ((line1 = br1.readLine()) != null) {
							if (line1 != null) {
								System.out.println(line1);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is1.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();

			new Thread() {
				public void run() {
					BufferedReader br2 = new BufferedReader(new InputStreamReader(is2));
					try {
						String line2 = null;
						while ((line2 = br2.readLine()) != null) {
							if (line2 != null) {
								System.out.println(line2);
							}
						}
					} catch (IOException e) {
						e.printStackTrace();
					} finally {
						try {
							is2.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}.start();

			if(process.waitFor() !=0){
				if (process.exitValue() == 1) {//p.exitValue()==0��ʾ����������1������������     
	                System.err.println("����ִ��ʧ��!");  
	                System.exit(1);  
	            } 
			}
			process.destroy();
			System.out.println("���н���...");
		} catch (Exception e) {
			try {
				process.getErrorStream().close();
				process.getInputStream().close();
				process.getOutputStream().close();
			} catch (Exception ee) {
			}
		}
	}

	public static void main(String[] args) {
		Proto2Code.genByBat("client");
		//System.out.println(System.getProperty("user.dir"));
	}

}
