package util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import prizegen.EightNumberChecker;
import prizegen.IPrizeChecker;
import prizegen.SixNumberChecker;
import prizegen.TenNumberChecker;

public class AppConfig {

	@Bean(name = "accountGenerator6")
	public IPrizeChecker getPrizeChecker6() {
		return new SixNumberChecker();
	}
	
	@Bean(name = "accountGenerator8")
	public IPrizeChecker getPrizeChecker8() {
		return new EightNumberChecker();
	}
	
	@Bean(name = "accountGenerator10")
	public IPrizeChecker getPrizeChecker10() {
		return new TenNumberChecker();
	}
}
