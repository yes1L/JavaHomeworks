package day4Homework3.concrete;

import day4Homework3.abstracts.GamerService;
import day4Homework3.entities.Gamer;

public class GamerManager implements GamerService{
	@Override
	public void add(Gamer gamer) {
		System.out.println("Oyuncu eklendi : " + gamer.getFirstName()+" "+gamer.getLastName());
	}
	
	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName()+" "+gamer.getLastName());
	}
	
	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName()+" "+gamer.getLastName());
	}
}
