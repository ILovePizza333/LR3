package LR3_pkg;

public class Sub implements IOperation{
	
	@Override
	public String getName() {
		return "Вычитание";
	}
	
	@Override
	public String getSign() {
		return "-";
	}

	@Override
	public double result(double a, double b) {
		return a-b;
	}
}
