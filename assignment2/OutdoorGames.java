package assignment2;

public class OutdoorGames {

	
		String gamename;
		String playername;
		OutdoorGames(String g,String p)
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
			
			IndoorGames i1=new IndoorGames("kabaddi","Ramesh");
			IndoorGames i2=new IndoorGames("khokho","Suresh");
			IndoorGames i3=new IndoorGames("cricket","kalpesh");
			i1.display();
			i2.display();
			i3.display();
			}
		
				
	}


