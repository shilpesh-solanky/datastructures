package design;

import java.util.ArrayList;

public class Parking_Lot_Design {

	public static void main(String[] args) {
		createParkingLot();

		Lot lot = new Lot();
		lot.setSize(1);
	}

	public static void createParkingLot() {
		int columns = 3;
		int rows = 3;

		int[][] grid = new int[rows][columns];

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				grid[i][j] = 0;
				System.out.print(" |" + grid[i][j] + " |");
			}
			System.out.println(" ");
		}
	}

}

class Lot {

	public int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

class Vehicle {

	public int size;
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}