import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class Main extends Frame implements WindowListener, ActionListener {

	Label label;
	JComboBox<String> jComboBox;
	Button b;
	TextArea output = new TextArea(5, 20);

	ArrayList<Song> song = new ArrayList<Song>();
	String[] optionsToChoose = { "Malibu", "Yellow", "Aloha" };

	public static void main(String[] args) {
		Main myWindow = new Main("Song App");
		myWindow.setSize(350, 200);
		myWindow.setVisible(true);
	}

	public Main(String title) {

		super(title);
		setLayout(new FlowLayout());
		addWindowListener(this);
		label = new Label("List of songs");
		jComboBox = new JComboBox<>(optionsToChoose);
		jComboBox.setBounds(80, 50, 200, 20);
		b = new Button("Get details");

		add(label);
		add(jComboBox);
		add(b);
		add(output);
		b.addActionListener(this);

		song.add(new Song("Malibu", "Miley", "Sunshine", 2017));
		song.add(new Song("Yellow", "Coldplay", "Moon", 2007));
		song.add(new Song("Aloha", "Sunset", "Hi", 2008));

	}

	public void actionPerformed(ActionEvent e) {
		for (int i = 0; i < song.size(); i++) {

			String selected = jComboBox.getItemAt(jComboBox.getSelectedIndex());
			String s = song.get(i).getName();

			if (selected.matches(s)) {
				output.setText(song.get(i).toString());
			}
		}
	}

	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}

	public void windowOpened(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowClosed(WindowEvent e) {
	}
}
