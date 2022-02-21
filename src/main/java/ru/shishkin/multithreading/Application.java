package ru.shishkin.multithreading;

public class Application {

	public static void main(String[] args) {
		System.out.println("Запускаем музыку во втором потоке");
		NewThread t = new NewThread("MyNewTread");
		System.out.println("Продолжаем выполнять какие-то действия в первом потоке");
		while(true)
		{
			sto();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private static void sto()
	{
		for(int i = 0; i < 100; i++)
		{
			System.out.println("Шаг " + i);
			System.out.println("Продолжаем выполнять какие-то действия в первом потоке");
		}
	}
}
