package prizegen;

public class EightNumberChecker implements IPrizeChecker {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkPrize(accountNumber, 8, 100);
	}
}
