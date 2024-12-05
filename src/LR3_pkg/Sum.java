package LR3_pkg;

public class Sum implements IOperation{
	
	@Override
	public String getName() {
		return "Сложение";
	}
	
	@Override
	public String getSign() {
		return "+";
	}

	@Override
	public double result(double a, double b) {
		return a+b;
	}
}
