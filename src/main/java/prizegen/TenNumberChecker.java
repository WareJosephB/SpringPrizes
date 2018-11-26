package prizegen;

public class TenNumberChecker implements IPrizeChecker {

	@Override
	public String checkPrize(String accountNumber) {
		return this.checkPrize(accountNumber, 10, 400);
	}

}
