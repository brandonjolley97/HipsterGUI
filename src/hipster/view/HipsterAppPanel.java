package hipster.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing .JTextField;
import javax.swing.*;
import javax.swing.SpringLayout;
import hipster.controller.HipsterAppController;
import java.awt.event.*;
import java.awt.Color;

public class HipsterAppPanel extends JPanel
{
	private SpringLayout baseLayout;
	private HipsterAppController baseController;
	private JComboBox <String>phraseComboBox;
	
	
	public HipsterAppPanel(HipsterAppController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		phraseComboBox = new JComboBox();
		
		setupComboBox();
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupComboBox()
	{
		String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
		DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
		phraseComboBox.setModel(phraseModel);
	}
	
	public void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.BLUE);
		this.add(phraseComboBox);
	}
	
	public void setupLayout()
	{
		
	}
	
	public void setupListeners()
	{
		phraseComboBox.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent selection)
			{
				int red = (int) (Math.random() * 256);
				int blue = (int) (Math.random() * 256);
				int green = (int) (Math.random() * 256);
				setBackground(new Color(red, green, blue));
				String updatedTitle = phraseComboBox.getSelectedItem().toString();
				baseController.getBaseFrame().setTitle(updatedTitle);
			}
		});
	}

}
