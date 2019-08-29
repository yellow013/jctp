package io.ffreedom.jctp;

import java.io.File;
import java.util.Arrays;

import io.ffreedom.common.env.SysPropertys;

public class PathTest {
	
	public static void main(String[] args) {
		
		SysPropertys.showAll();
		
		System.out.println("=========================================");
		
		System.out.println(System.getenv("JAVA_HOME"));
		
		System.out.println(System.getProperty("JAVA_HOME"));
		
		System.out.println(new File("").getAbsolutePath() + "/lib");
		
		File file = new File(new File("").getAbsolutePath() + "/lib/linux64");

		System.out.println(Arrays.asList(file.list()));
		
	}

}
