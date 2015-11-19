package hipster.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400,400);
		this.setTitle("Universe");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public HipsterAppController getBaseController()
	{
		return baseController;
	}
	
}

