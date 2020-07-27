package com.wj;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MethodTest {

	public static void main(String[] args){
//		StringBuffer buffer = new StringBuffer(new String("<h1>Welcome Page</h1>&nbsp;\n"));
//		buffer.append("<a href=\"#\"/>");
//		System.out.println(buffer.toString());
//		System.out.println(getPropery());
		makelog();
	}
	protected static  String getPropery(){
		return System.getProperty("os.name");
	}
	public static void makelog(){
		Logger logger=LogManager.getLogger(MethodTest.class.getName());
//		log.info("我是info信息");
//		log.warn("我是warn信息");
//		log.debug("我是debug信息");
//		log.fatal("我是fatal信息");
//	    // 这个就是制定Level类型的调用
		logger.log(Level.DEBUG, "我是debug信息");
		logger.log(Level.INFO, "我是infor信息");
		logger.log(Level.ERROR, "我是error信息");
		logger.log(Level.TRACE, "我是trace信息");
//		log.log(Level.FATAL, "我是fatal信息");
//		log.log(Level.ALL, "我是all信息");
//		MyLogger loger = new MyLogger();
//		loger.log(Level.INFO, "Logger4j loger");
//		loger.info("Logger4j loging");
	}
}
