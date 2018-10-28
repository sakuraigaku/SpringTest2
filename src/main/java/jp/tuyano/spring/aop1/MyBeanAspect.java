package jp.tuyano.spring.aop1;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class MyBeanAspect {

	@AfterReturning(value = "execution(* jp.tuyano.spring.aop1.IMyBean.toString())", returning = "str")
	public void toStringAfterReturning(String str) {
		System.out.println("*toString return...*");
		System.out.println("return:" + str);
		System.out.println("*...end toString returning");
	}

	@AfterThrowing(value = "execution(* jp.tuyano.spring.aop1.MyBean2.appData(..))", throwing = "e")
	public void addDateAfterThrowing(Exception e) {
		System.out.println("*Expect in addData...*z");
		System.out.println(e.getLocalizedMessage());
		System.out.println("*...end Expect in addData*");
	}

	@Around("execution(* jp.tuyano.spring.aop1.MyBean1.appData(..))")
	public void toStringAround(ProceedingJoinPoint joinPoint) {
		System.out.println("*around addDate...*");
		System.out.println("before:" + joinPoint.getTarget());
		try {
			joinPoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("after:" + joinPoint.getTarget());
		System.out.println("*...end around addData.*");
	}
}
