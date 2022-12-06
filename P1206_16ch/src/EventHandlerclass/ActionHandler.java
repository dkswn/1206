package EventHandlerclass;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("Button1")) {
			System.out.println("Button1 Click!");
		}
		if (e.getActionCommand().equals("Button2")) {
			System.out.println("Button2 Click!");
		}
		if (e.getActionCommand().equals("Button3")) {
			System.out.println("Button3 Click!");
		}
		if (e.getActionCommand().equals("Button4")) {
			System.out.println("Button4 Click!");
		}
		if (e.getActionCommand().equals("Button5")) {
			System.out.println("Button5 Click!");
		}
	}
}
