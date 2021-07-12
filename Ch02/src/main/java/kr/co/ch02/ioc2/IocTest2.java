package kr.co.ch02.ioc2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * ��¥ : 2021/07/12
 * �̸� : ��ö��
 * ���� : ������ Ioc ������̼� ��� DI �ǽ��ϱ�
 */
public class IocTest2 {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("spring-context.xml");
		
		Tv ltv = (Tv) ctx.getBean("lgTV");
		Tv stv = (Tv) ctx.getBean("samsungTV");
		
		ltv.power();
		ltv.chUp();
		ltv.chDown();
		ltv.soundUp();
		
		stv.power();
		stv.chUp();
		stv.chDown();
		stv.soundDown();
		
	}
}
