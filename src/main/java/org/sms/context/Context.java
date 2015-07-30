package org.sms.context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Context {
	
	static ApplicationContext ctx=null;
	
	public static ApplicationContext getCtx(){
		if(ctx==null)
			ctx = new ClassPathXmlApplicationContext("Beans.xml");
		return ctx;
	}
}
