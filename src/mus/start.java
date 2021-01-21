package mus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class start {

	public static void main(String[] args) {
		System.out.println("Перед функцией работает");
		newt t = new newt("Мой поток");
		System.out.println("После функции не работает");
		while(true)
		{
		sto();
		}
	}

	static void sto()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println(i);
		}
	}
	
	static boolean go()
	{
		try {
			FileInputStream music=new FileInputStream("1.mp3");
			Player player = new Player(music);
			player.play();
			player.close();
			music.close();
		} catch (FileNotFoundException e) {
			System.out.print("Файл не найден!");
		} catch (JavaLayerException e) {
			System.out.print("Файл не запущен!");
		} catch (IOException e) {
			System.out.print("Файл не закрывается!");
		}
		
		return true;	
	}
}
