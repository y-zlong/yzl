package com.github.yzl;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class Main {
	public static void main(String[] args) throws Exception {
		//创建一个pdf格式的文件
		PDDocument pdd = new PDDocument();
		
		for (int i = 0; i < 5; i++) {
			PDPage page = new PDPage();
			pdd.addPage(page);
		}
		
		//将文件保存路径
		pdd.save("src\\demo.pdf");
		//关闭
		pdd.close();
	}
}
