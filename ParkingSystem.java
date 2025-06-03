class ParkingSystem {
    private int[] slots;


    public ParkingSystem(int big, int medium, int small) {
        slots = new int[4]; // Use index 1 for big, 2 for medium, 3 for small
        slots[1] = big;
        slots[2] = medium;
        slots[3] = small;
    }


    public boolean addCar(int carType) {
        if (slots[carType] > 0) {
            slots[carType]--;
            return true;
        }
        return false;
    }
}
