package day4Homework3.abstracts;

import day4Homework3.entities.Campaign;
import day4Homework3.entities.Game;
import day4Homework3.entities.Gamer;

public interface SaleService {
	void sale(Gamer gamer, Game game);
	void campaignSale(Gamer gamer, Game game, Campaign campaign);
}
