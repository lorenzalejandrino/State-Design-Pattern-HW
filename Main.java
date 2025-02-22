public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.selectItem();
        machine.insertCoin(5);
        machine.insertCoin(5);
        System.out.println("");
        machine.selectItem();
        machine.insertCoin(10);
        System.out.println("");
        machine.setOutOfOrder();
        machine.insertCoin(5);
    }
}