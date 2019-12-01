package server;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.CBanner;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;

public class MainMenuWin {

	protected Shell shlWelcome;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainMenuWin window = new MainMenuWin();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlWelcome.open();
		shlWelcome.layout();
		while (!shlWelcome.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlWelcome = new Shell();
		shlWelcome.setSize(462, 451);
		shlWelcome.setText("Welcome");
		
		CBanner banner = new CBanner(shlWelcome, SWT.NONE);
		banner.setBounds(168, 137, 0, 0);
		
		Label lblWelcomeToFaking = new Label(shlWelcome, SWT.WRAP | SWT.CENTER);
		lblWelcomeToFaking.setBounds(116, 40, 213, 73);
		lblWelcomeToFaking.setText("Welcome To FAKING IT    Waitting For Palyers....");
		
		Button btnExit = new Button(shlWelcome, SWT.NONE);
		btnExit.setBounds(258, 311, 105, 35);
		btnExit.setText("Exit");
		
		Button btnStart = new Button(shlWelcome, SWT.NONE);
		btnStart.setGrayed(true);
		btnStart.setBounds(88, 311, 105, 35);
		btnStart.setText("Start");
		
		Group grpPlayers = new Group(shlWelcome, SWT.NONE);
		grpPlayers.setText("Players");
		grpPlayers.setBounds(33, 105, 330, 185);
		
		List list = new List(grpPlayers, SWT.BORDER);
		list.setBounds(37, 37, 261, 122);

	}
}
