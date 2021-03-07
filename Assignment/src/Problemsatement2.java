abstract class cricketteam
{
	
	void bowler()
	{
		System.out.println("This is the bowler");
	}
	
	void batsmen()
	{
		System.out.println("This is the batsmen");
	}
	void allrounder()
	{
		System.out.println("These are the allrounders");
	}
	void wicketkeeper()
	{
		System.out.println("This is the wicketkeeper");
	}
	
	
}
class menteam extends cricketteam
{
	menteam(){
		System.out.println("This is a mens cricket team");
	}
}
class womenteam extends cricketteam
{
	womenteam(){
		System.out.println("This is a womens cricket team");
	}

	
}


public class Problemsatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is a cricket team");

		
		
        cricketteam c=new menteam();
		
		System.out.println(c instanceof menteam);
		
		c.bowler();
		c.batsmen();
		c.allrounder();
		c.wicketkeeper();
		
		c=new womenteam();
		System.out.println(c instanceof womenteam);
		
		c.bowler();
		c.batsmen();
		c.allrounder();
		c.wicketkeeper();

		
	}

}
