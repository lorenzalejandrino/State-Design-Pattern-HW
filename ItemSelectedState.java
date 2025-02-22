class ItemSelectedState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Item already selected. Please insert coins.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Coin inserted. Current balance: " + machine.getBalance());
        if (machine.getBalance() >= machine.getItemPrice()) {
            System.out.println("Sufficient balance. Dispensing item...");
            machine.setState(new DispensingState());
            machine.dispenseItem();
        }
    }
    public void dispenseItem(VendingMachine machine) {
        System.out.println("Insert more coins to dispense the item.");
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine set to Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}