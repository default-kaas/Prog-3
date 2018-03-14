package week7OefenTentamen1;

import java.util.ArrayList;

public class SeaBattle {
	private ArrayList<Player> players = new ArrayList();
	
	public SeaBattle(int nPlayers) {
		for(int i=0;i<nPlayers;i++) {
			Player p = new Player();
			players.add(p);
		}
		
		
	}
	
	public void play() {
		try {
			
		}catch(Exception a){
			
		}
	}
	
	
	
	/*
	public void greet() {
		System.out.println("Hello player/players, the game you are going to play is battleship"
				+"\n"+"With how many players would you like to play?"
				+"\n"+"The options are 1 player vs the computer"
				+"\n"+"or a 2 player competive mode where 2 palyers face of against one another.");
	}
	*/
	/*
	public void rules(int amount) {
		if(amount == 1) {
			System.out.println("The game mode you chose is player vs the computer."
					+"\n"+"In this game the computer randomly place the ships in an a grid of ten by ten."
					+"\n"+"And you have to quess in which fields the ships are placed."
					+"\n"+"You will do this throught putting commands in the console when the consolse askes for a command"
					+"\n"+"And these commands will be strings like C4 or G10." /*place down "" 
					+"\n"+"I wish you good luck and fun."); 
		}else if(amount == 2) {
			System.out.println("The game mode you chose is player vs player competive mode."
					+"\n"+ "In this game the computer will randomly place the ships in a grid of ten by ten for each player"
					+"\n"+"And you have to quess in which fields the ships are placed from you opponent."
					+"\n"+"You will do this throught putting commands in the console when the consolse askes for a command"
					+"\n"+"And these commands will be strings like C4 or G10." /*place down ""
					+"\n"+"Also if a player succesfully hits one of his opponents ships he or she will get another turn until they miss."
					+"\n"+"I wish you both good luck and fun.");
		}else if(amount > 2) {
			System.out.println("You can't play this game with more then 2 players.");
		}else {
			System.out.println("You at least need 1 player to play this game.");
		}
		
	}
	*/
	
	/*Need to make a check in play() if the amount of players is valid
	public void amountOfPlayers(int amount) {
		for(int i=0;i<amount;i++) {
			Player p = new Player();
			player.add(p);
		}
	}
	
	public void checkChose() {
		if(player.size() == 1) {
			/*This will generate the a single map.
		}else if(player.size()==2) {
			/*This will generate a map for each player.
		}
		
	}
	
	public void turnOf(int number) {
		System.out.println("It is the turn of "+ player.get(number).getName()+ ".");
	}
	
	*/
}
