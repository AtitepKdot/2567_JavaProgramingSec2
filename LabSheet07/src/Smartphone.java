
public class Smartphone {
	private String brand;
	private String model;
	private int storageCapacity;
	private final int MAX_STORAGE_CAPACITY = 521;
	Smartphone() {
		brand = "";
		model = "";
		storageCapacity = 0;
		
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		if (this.brand.length() < 2 ) {
			System.out.println("Error: Brand must have at least 2 characters!");
		}else {
			this.brand = brand;
		}
		
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		if (this.model.length() < 2) {
			System.out.println("Error: Model must have at least 2 characters!");
		}else {
			this.model=model;
		}
		
	}
	public int getStorageCapicity() {
		return storageCapacity;
	}
	public void setStorageCapicity(int storageCapacity) {
		if(storageCapacity > 1 && storageCapacity < MAX_STORAGE_CAPACITY ) {
			System.out.println("Error: Storage capacity must be between 1 and 512 GB!");
		}else {
			this.storageCapacity = storageCapacity;
		}
		
	}
	public void increaseStorage(int additionalStorage) {
		if (additionalStorage > 0 && (storageCapacity + additionalStorage) < MAX_STORAGE_CAPACITY) {
			storageCapacity = storageCapacity + additionalStorage;
		}
		else {
			System.out.println("Error: Storage capacity cannot exceed <MAX_STORAGE_CAPACITY> GB!");

		}
		if (additionalStorage <= 0) {
System.out.println("Error: Additional storage must be positive!");
			}
		}
		public int getRemainingStorage(int usedStorage) {
			if (usedStorage >0 && usedStorage < storageCapacity) {
				return storageCapacity - usedStorage;
			}else {
				System.out.println("Error: Used storage must be between 0 and <storageCapacity> GB!");
			return -1;
			}
		}
		public void printDetails() {
			System.out.println("Smartphone Details:" );
			System.out.println("Brand: " + brand);
			System.out.println("Model:" + model);
			System.out.println("Storage Capacity: " + storageCapacity);
		}
	}


