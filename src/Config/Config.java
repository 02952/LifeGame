package Config;

import java.awt.Color;

public interface Config {
	public static final int SIZE = 5;		//����ĳߴ�
	public static final int ROWS = 160;		//��
	public static final int COLS = 140;		//��
	public static int[][] PaintRect = new int[COLS][ROWS];				//��ͼ�ľ���
	public static final Color DefaultColor = new Color(192, 192, 192);    //��ɫ
}