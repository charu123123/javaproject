package assignment2;

import java.util.*;
public class IndoorGames {
String gamename;
String playername;
IndoorGames(String g,String p)
{
	gamename=g;
	playername=p;
}
public void display()
{
	System.out.println("gamename is:"+gamename+""+"\nplayername:"+playername);
	System.out.println();
}
	public static void main(String[] args) {
	
	IndoorGames i1=new IndoorGames("chess","\nRamesh");
	IndoorGames i2=new IndoorGames("carom","\nSuresh");
	IndoorGames i3=new IndoorGames("tabletennis","\nkalpesh");
	i1.display();
	i2.display();
	i3.display();
	}
}
		