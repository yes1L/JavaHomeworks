package day4Homework3.concrete;

import day4Homework3.abstracts.GamerCheckService;
import day4Homework3.abstracts.GamerService;
import day4Homework3.entities.Gamer;

public class GamerCheckManager implements GamerService{
	
	private GamerCheckService gamerCheckService;
	
	public GamerCheckManager(GamerCheckService gamerCheckService) {
		super();
		this.gamerCheckService = gamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Oyuncu kaydedildi : " + gamer.getFirstName() + " " + gamer.getLastName());
		}else {
			System.out.println("Error");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Oyuncu silindi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Oyuncu güncellendi : " + gamer.getFirstName() + " " + gamer.getLastName());
	}
	
}
