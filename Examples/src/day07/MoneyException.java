package day07;

public class MoneyException extends Exception{
	MoneyException() {	
		super("money �ܰ��� ���� ��� �ȵ�");
	}
	MoneyException(String msg) {
		super(msg);
		
	}
}
