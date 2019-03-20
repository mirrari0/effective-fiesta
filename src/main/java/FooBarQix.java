public class FooBarQix {
    public String playGame(int i) {
        String playerEntered = String.valueOf(i);

        if(i % 3 == 0){
            playerEntered = "foo";
        }

        return playerEntered;
    }
}
