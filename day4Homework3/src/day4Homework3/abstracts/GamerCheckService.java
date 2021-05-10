package day4Homework3.abstracts;

import day4Homework3.entities.Gamer;

public interface GamerCheckService {
	boolean checkIfRealPerson(Gamer gamer);
	boolean CheckIfRealPerson(Gamer gamer) throws Exception;
}
