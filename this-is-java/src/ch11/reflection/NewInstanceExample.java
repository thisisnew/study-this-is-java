package ch11.reflection;

public class NewInstanceExample {
	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("ch11.reflection.SendAction");
			Class clazz = Class.forName("ch11.reflection.ReceiveAction");
			Action action = (Action) clazz.newInstance();
			action.excute();
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
