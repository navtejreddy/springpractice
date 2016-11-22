package com.thirdproject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {

	      ApplicationContext context = new FileSystemXmlApplicationContext
	            ("/Users/rajanarasimhareddyjaidi/Documents/SpringPractice/AppContextContainers/src/Bean.xml");

	      HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	      obj.getMessage();
	   }
}
