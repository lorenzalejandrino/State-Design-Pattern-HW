class DispensingState implements VendingMachineState {
    public void selectItem(VendingMachine machine) {
        System.out.println("Please wait, item is being dispensed.");
    }
    public void insertCoin(VendingMachine machine, int amount) {
        System.out.println("Cannot insert coins while dispensing.");
    }
    public void dispenseItem(VendingMachine machine) {
        if (machine.getInventory() > 0) {
            machine.decreaseInventory();
            machine.resetBalance();
            System.out.println("Item dispensed. Returning to Idle state.");
            machine.setState(new IdleState());
        } else {
            System.out.println("Out of stock! Setting machine to Out of Order.");
            machine.setState(new OutOfOrderState());
        }
    }
    public void setOutOfOrder(VendingMachine machine) {
        System.out.println("Machine set to Out of Order.");
        machine.setState(new OutOfOrderState());
    }
}