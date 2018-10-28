package jp.tuyano.spring.aop1;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBeanAspect {

	@Before("execution(* jp.tuyano.spring.aop1.IMyBean.appData(..))")
	public void appDataBefore(JoinPoint joinPoint) {
		System.out.println("*addData before...*");
		String args ="args:  \"";
		for (Object ob : joinPoint.getArgs()) {
			args +=ob+"\" ";
		}
		System.out.println(args);
	}
}
