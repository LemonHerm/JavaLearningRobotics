package Java102;
import java.util.ArrayList;

public class Grid<T> {
	private final ArrayList<ArrayList<T>> grid;
	public final int sideLength;
	public static int maximum_sidelenght = 0;

	public Grid(int sideLength, T defaultVal) {
		this.sideLength = sideLength;
		this.grid = new ArrayList<ArrayList<T>>(sideLength);
		for (int i = 0; i < sideLength; i++) {
			grid.add(new ArrayList<>(sideLength));
			for (int j = 0; j < sideLength; j++) {
				grid.get(i).add(defaultVal);
			}
		}
		if (this.sideLength > maximum_sidelenght) {
			maximum_sidelenght = sideLength;
		}
	}

	public T get(int row, int col) {
		return grid.get(row).get(col);
	}

	public void set(int row, int col, T val) {
		grid.get(row).set(col, val);
	}

	@Override
	public String toString() {
		String str = "";
		for (ArrayList<T> row : grid) {
			for (T element : row) {
				str += element + " ";
			}
			str += "\n";
		}
		return str;
	}

	public ArrayList<T> diagonal() {
		int Index = 0;
		ArrayList<T> Diagonal_output = new ArrayList<T>();
		for (ArrayList<T> row : grid) {
			Diagonal_output.add(row.get(Index));
			Index ++;
		}
		return Diagonal_output;
	}

	public static int max_sidelength() {
		return maximum_sidelenght;
	}
}
