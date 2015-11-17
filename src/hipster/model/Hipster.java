package hipster.model;

public class Hipster 
{
	private String name;
	private String [] hipsterPhrases;
	
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		setupArray();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "That is way too mainstream.";
		hipsterPhrases[1] = "Insert witty comment here.... or not.";
		hipsterPhrases[2] = "I would be a hipster if being a hipster still meant that I'm a hipster, but now it doesn't work like that.";
		hipsterPhrases[3] = "I was hipster before hipsters were a thing.";
	}
	
	
	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public String[] getHipsterPhrases() 
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases) 
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	
	
	
}
