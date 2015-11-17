package hipster.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing .JTextField;
import javax.swing.SpringLayout;
import hipster.controller.HipsterAppController;

public class HipsterAppPanel extends JPanel
{
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	private HipsterAppController baseController;
	
	
	public HipsterAppPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("ANSWER");
		firstTextField = new JTextField("Question of Life");
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstButton);
		this.add(firstTextField);
	}
	
	public void setupListeners()
	{
		
	}

}
