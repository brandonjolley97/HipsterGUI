package hipster.controller;

import hipster.view.HipsterAppFrame;
import hipster.model.Hipster;

public class HipsterAppController 
{
	private Hipster firstHipster;
	private HipsterAppFrame baseFrame;
	
	public HipsterAppController()
	{
		firstHipster = new Hipster(); 
		baseFrame = new HipsterAppFrame(this);
	}
	
	public void start()
	{
		String myName = baseFrame.getResponse("What is your name?");
		firstHipster.setName(myName);
		baseFrame.setTitle(myName + "'s Hipster Project!");
	}
	 public Hipster getFirstHipster()
	 {
		 return firstHipster;
	 }
	 
	 public HipsterAppFrame getBaseFrame()
	 {
		 return baseFrame;
	 }
	
}
