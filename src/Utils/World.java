package Utils;

import java.util.Random;

import Config.Config;

public class World implements Config {
	private static Random random = new Random();
	public static void newWorld(){
		int lifeNumber = random.nextInt(COLS * ROWS);
		int i, j;
		for(int count = 0; count < lifeNumber; count++) {
			i = random.nextInt(COLS);
			j = random.nextInt(ROWS);
			PaintRect[i][j] = 1;
		}
	}
	private static int getNeighborNumber(int i, int j) {
		int count = 0;
		if(i - 1 >= 0 && j - 1 >= 0) {
			count = count + PaintRect[i - 1][j - 1] + PaintRect[i][j - 1] + PaintRect[i - 1][j];
		}
		if(i + 1 < COLS && j + 1 < ROWS) {
			count = count + PaintRect[i + 1][j + 1] + PaintRect[i][j + 1] + PaintRect[i + 1][j + 1];
		}
		if(i + 1 <COLS && j - 1 >= 0) count += PaintRect[i + 1][j - 1];
		if(i - 1 >= 0 && j + 1 < ROWS) count += PaintRect[i - 1][j + 1];
		return count;
	}
	public static void nextWorld() {
		int neighborNumber;
		for(int i = 0; i < COLS; i++) {
			for(int j = 0; j < ROWS; j++) {
				neighborNumber = getNeighborNumber(i, j);
				if(neighborNumber == 3) PaintRect[i][j] = 1;
				else if(neighborNumber == 2);
				else PaintRect[i][j] = 0;
			}
		}
	}
}