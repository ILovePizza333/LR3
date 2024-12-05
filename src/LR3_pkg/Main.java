package LR3_pkg;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Main {

	public static void main(String[] args) {

		JTextField firstField; // Поле для первого элемента
		JTextField secondField; // Поле для второго элемента
		JTextField operationField; // Поле для второго элемента
		JTextField resultField; // Поле для результата
		JTextArea resultArea; // Поле для результата

		JButton resultButton; // Кнопка вычисления

		JFrame mainFrame = new JFrame();
		mainFrame.setTitle("Калькулятор");
		mainFrame.setLocation(600, 400);
		mainFrame.setSize(800, 300);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setLayout(new FlowLayout());

		// Создание и добавление компонентов
		firstField = new JTextField(10);
		mainFrame.add(firstField);

		operationField = new JTextField(3);
		mainFrame.add(operationField);

		secondField = new JTextField(10);
		mainFrame.add(secondField);

		resultButton = new JButton("Подсчитать");
		mainFrame.add(resultButton);

		resultField = new JTextField(10);
		mainFrame.add(resultField);
		resultField.setEditable(false);

		resultArea = new JTextArea(1, 10);
		resultArea.setEditable(false);
		mainFrame.add(resultArea);

		// Обработчик кнопки
		resultButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					// PasswordCalc.calculator();
					double a = Double.parseDouble(firstField.getText());
					double b = Double.parseDouble(secondField.getText());
					String op = operationField.getText();
					String str = "";
					switch (op) {
					case ("+"):
						Sum sum1 = new Sum();
						str = sum1.getName() + " " + sum1.getSign();
						resultArea.setText(str);
						resultField.setText(String.valueOf(sum1.result(a, b)));
						break;

					case ("-"):
						Sub sub1 = new Sub();
						str = sub1.getName() + " " + sub1.getSign();
						resultArea.setText(str);
						resultField.setText(String.valueOf(sub1.result(a, b)));
						break;

					case ("/"):
						Div div1 = new Div();
						str = div1.getName() + " " + div1.getSign();
						resultArea.setText(str);
						double res = div1.result(a, b);
						resultField.setText(String.format("%5.5f", res));
						break;

					case ("*"):
						Mul mul1 = new Mul();
						str = mul1.getName() + " " + mul1.getSign();
						resultArea.setText(str);
						resultField.setText(String.valueOf(mul1.result(a, b)));
						break;
					default:
						resultField.setText("Ошибка");
						resultArea.setText("Некорректная операция");
						break;

					}
				} catch (NumberFormatException ex) {
					resultField.setText("Ошибка");
					resultArea.setText("Некорректные значения ");
				}

			}
		});

		mainFrame.setVisible(true);
	}
}
