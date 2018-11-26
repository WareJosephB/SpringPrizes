package prizegen;

public interface IPrizeChecker {

	default String checkPrize(String accountNumber, int length, int basePrize) {
		if (accountNumber.length() != length + 1) {
			return "Error, string the wrong length.";
		} else {
//			if (accountNumber.startsWith("A")) {
//				return "Congratulations! You have won £" + String.valueOf(basePrize) + "!";
//			} else if (accountNumber.startsWith("B")) {
//				return "Congratulations! You have won £" + String.valueOf(2 * basePrize) + "!";
//			} else {
//				return "Sorry, no prize today.";
//			}
			String letter = accountNumber.substring(0, 1);
			switch (letter) {
			case "A":
				return "Congratulations! You have won £" + String.valueOf(basePrize) + "!";
			case "B":
				return "Congratulations! You have won £" + String.valueOf(2 * basePrize) + "!";
			default:
				return "Sorry, no prize today.";
			}
		}
	}

	String checkPrize(String accountNumber);
}
