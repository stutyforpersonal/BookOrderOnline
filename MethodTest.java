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
//		log.info("����info��Ϣ");
//		log.warn("����warn��Ϣ");
//		log.debug("����debug��Ϣ");
//		log.fatal("����fatal��Ϣ");
//	    // ��������ƶ�Level���͵ĵ���
		logger.log(Level.DEBUG, "����debug��Ϣ");
		logger.log(Level.INFO, "����infor��Ϣ");
		logger.log(Level.ERROR, "����error��Ϣ");
		logger.log(Level.TRACE, "����trace��Ϣ");
//		log.log(Level.FATAL, "����fatal��Ϣ");
//		log.log(Level.ALL, "����all��Ϣ");
//		MyLogger loger = new MyLogger();
//		loger.log(Level.INFO, "Logger4j loger");
//		loger.info("Logger4j loging");
	}
}
