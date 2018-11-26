package prizegen;

public class SixNumberChecker implements IPrizeChecker {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkPrize(accountNumber, 6, 25);

	}

}
