package jp.tuyano.spring.aop1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class MyBeanConfig {
	@Bean
	public MyBean1 bean1() {
		return new MyBean1();
	}

	@Bean
	public MyBean2 bean2() {
		return new MyBean2();
	}

	@Bean
	public MyBeanAspect app1() {
		return new MyBeanAspect();
	}

}
