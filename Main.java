public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        System.out.println("Selecting Item");
        machine.selectItem();
        System.out.println("");

        System.out.println("Inserting Coins");
        machine.insertCoin(30);
        machine.insertCoin(30);
        System.out.println("");

        System.out.println("Selecting Item");
        machine.selectItem();
        System.out.println("");

        System.out.println("Inserting Extra Coin");
        machine.insertCoin(50);
        System.out.println("");

        System.out.println("Setting Machine Out of Order");
        machine.setOutOfOrder();
        System.out.println("");

        System.out.println("Trying to Select in OutOfOrderState");
        machine.selectItem();
        System.out.println("");

        System.out.println("Trying to Insert Coin in OutOfOrderState");
        machine.insertCoin(50);
    }
}
