package com.journaldev.spring.beans.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.journaldev.spring.beans.context.ConvertJsonToObjectClss;

@Component
@Aspect
@EnableAspectJAutoProxy
public class execBefore {

	private static Logger logger = LoggerFactory.getLogger(ConvertJsonToObjectClss.class);
	@Before("execution(* com.journaldev..*.controllers..*.*(..))")
	public void name() {
		logger.info("name");
	}
}
