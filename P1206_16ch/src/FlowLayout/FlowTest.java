package FlowLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowTest {
	private Frame frame;
	private Button button1, button2, button3;
	
	public FlowTest() {
		frame = new Frame("flowLayout example");
		button1 = new Button("check");
		button2 = new Button("open");
		button3 = new Button("close");
	
	}
	
	public void startFrame() {
		frame.setLayout(new FlowLayout());
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
	
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();

	}

}
