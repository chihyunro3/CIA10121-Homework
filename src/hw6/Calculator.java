package hw6;

public class Calculator {

	private int x;
	private int y;

	public Calculator() {
	}

	public Calculator(int x, int y) throws CalException{
		this.x = x;
		this.y = y;
//		if (y < 0) {
//			throw new CalException("次方為負值，結果回傳不為整數！");
//		}else if (x == 0 && y == 0) {
//			throw new CalException("0的0次方沒有意義！");
//		}
		
		setX(x);
		setY(y);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) throws CalException {
		this.x = x;
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		}	
	}

	public int getY() {
		return y;
	}

	public void setY(int y) throws CalException {
		this.y = y;
		if (y < 0) {
			throw new CalException("次方為負值，結果回傳不為整數！");
		}else if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		}
	}

	public int powerXY(int x, int y) {
		return (int) Math.pow(x, y);
	}

}
