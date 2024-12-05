package LR3_pkg;

public class Mul implements IOperation{
	
	@Override
	public String getName() {
		return "Умножение";
	}
	
	@Override
	public String getSign() {
		return "*";
	}

	@Override
	public double result(double a, double b) {
		return a*b;
	}
}
