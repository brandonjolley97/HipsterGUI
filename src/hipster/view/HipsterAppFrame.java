package hipster.view;

import javax.swing.JFrame;
import hipster.controller.HipsterAppController;

public class HipsterAppFrame extends JFrame
{
	
	private HipsterAppController baseController;
	private HipsterAppPanel basePanel;
	
	public HipsterAppFrame(HipsterAppController baseController)
	{
		this.baseController = baseController;
		basePanel = new HipsterAppPanel(baseController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setTitle("Universe");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public HipsterAppController getBaseController()
	{
		return baseController;
	}
	
}

