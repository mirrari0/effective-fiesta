public class FooBarQix {
    public String playGame(int number) {
        String playerEntered = "";

        if (number % 3 == 0) {
            playerEntered = "foo";
        }
        if (number % 5 == 0) {
            playerEntered += "bar";
        }

        if (number % 7 == 0) {
            playerEntered += "qix";
        }

        String stringNum = String.valueOf(number);
        for (int i = 0; i < stringNum.length(); i++) {
            if ('3' == stringNum.charAt(i)) {
                playerEntered += "foo";
            }
            if ('5' == stringNum.charAt(i)) {
                playerEntered += "bar";
            }
            if ('7' == stringNum.charAt(i)) {
                playerEntered += "qix";
            }
        }

        if (playerEntered.equals("")) {
            playerEntered = stringNum;
        }

        return playerEntered;
    }
}
