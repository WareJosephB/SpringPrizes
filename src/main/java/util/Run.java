package util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import prizegen.IPrizeChecker;

public class Run {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		IPrizeChecker prizeChecker = appContext.getBean("accountGenerator10", IPrizeChecker.class);
		System.out.println(prizeChecker.checkPrize("C1111111111"));
		System.out.println(prizeChecker.checkPrize("A1111111111"));
		System.out.println(prizeChecker.checkPrize("B1111111111"));
		System.out.println(prizeChecker.checkPrize("B111111111"));

		prizeChecker = appContext.getBean("accountGenerator8", IPrizeChecker.class);

		System.out.println(prizeChecker.checkPrize("C11111111"));
		System.out.println(prizeChecker.checkPrize("B11111111"));
		System.out.println(prizeChecker.checkPrize("A11111111"));
		System.out.println(prizeChecker.checkPrize("A1111111"));

		prizeChecker = appContext.getBean("accountGenerator6", IPrizeChecker.class);

		System.out.println(prizeChecker.checkPrize("C111111"));
		System.out.println(prizeChecker.checkPrize("B111111"));
		System.out.println(prizeChecker.checkPrize("A111111"));
		System.out.println(prizeChecker.checkPrize("A11111"));

	}

}
