package swu.oopj.recap.container_transport;

public abstract class CargoHolder {

    private final double weight;
    private final Cargo[] content;
    private int cargoCount;

    public CargoHolder(double weight) {
        this.weight = weight;
        content = new Cargo[100];
        cargoCount = 0; 
    }

    protected double getCargoWeight() {
        double cargoWeight = 0;
        for (int i = 0; i < cargoCount; i++) {
            cargoWeight += content[i].getWeight();
        }
        return cargoWeight;
    }

    protected double getCargoVolume() {
        double cargoVolume = 0;
        for (int i = 0; i < cargoCount; i++) {
            cargoVolume += content[i].getVolume();
        }
        return cargoVolume;
    }

    public double getWeight() {
        return this.weight + getCargoWeight();
    }
    
    protected int cargoCount() {
    	return cargoCount;
    }

    public boolean add(Cargo cargo) {
        content[cargoCount++] = cargo;
        return true;
    }

    public boolean remove(Cargo cargo) {
        for (int i = 0; i < cargoCount; i++) {
            if (cargo.getId() == content[i].getId()) {
                //cargo found - remove it from array 
            	// (copy last to index i) and decrease array size
            	content[i] = content[cargoCount-1]; 
                --cargoCount;
                return true;
            }
        }
        return false;
    }
}
