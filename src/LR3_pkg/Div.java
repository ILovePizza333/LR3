package LR3_pkg;

public class Div implements IOperation{
	
	@Override
	public String getName() {
		return "Деление";
	}
	
	@Override
	public String getSign() {
		return "/";
	}

	@Override
	public double result(double a, double b) {
		return a/b;
	}
}
