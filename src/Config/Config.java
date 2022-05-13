package Config;

import java.awt.Color;

public interface Config {
	public static final int SIZE = 5;		//方块的尺寸
	public static final int ROWS = 160;		//列
	public static final int COLS = 140;		//行
	public static int[][] PaintRect = new int[COLS][ROWS];				//绘图的矩阵
	public static final Color DefaultColor = new Color(192, 192, 192);    //灰色
}