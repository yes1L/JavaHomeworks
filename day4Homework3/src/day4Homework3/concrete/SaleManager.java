package day4Homework3.concrete;

import day4Homework3.abstracts.SaleService;
import day4Homework3.entities.Campaign;
import day4Homework3.entities.Game;
import day4Homework3.entities.Gamer;

public class SaleManager implements SaleService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName() + " oyunu sat�n ald�. Oyun ad� : " + game.getGameName() + " : " + game.getUnitPrice()+"$");
	}

	@Override
	public void campaignSale(Gamer gamer, Game game, Campaign campaign) {
		System.out.println(gamer.getFirstName() + " oyunu kampanya ile sat�n ald�. Oyun ad� : " +game.getGameName()+" Kampanya ad� : "+campaign.getCampaignName());
		System.out.println(game.getGameName()+" oyunun kampanya sonras� fiyat� : "+game.getAfterDiscountPrice()+"$");
	}
}
