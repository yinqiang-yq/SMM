package com.smm.util;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class Init implements BeanPostProcessor  {

	@Override
	public Object postProcessAfterInitialization(Object bean, String arg1)
			throws BeansException {
		System.out.println(111);
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String arg1)
			throws BeansException {

		System.out.println(222);
		return bean;
	}
}
