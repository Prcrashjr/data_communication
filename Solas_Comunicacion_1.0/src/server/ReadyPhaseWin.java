package server;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import javax.swing.ImageIcon;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

public class ReadyPhaseWin {

	protected Shell shlGameOn;
	private Text text;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ReadyPhaseWin window = new ReadyPhaseWin();
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
		shlGameOn.open();
		shlGameOn.layout();
		while (!shlGameOn.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlGameOn = new Shell();
		shlGameOn.setSize(394, 371);
		shlGameOn.setText("GAME ON");
		
		Label lblWaitingForPlayers = new Label(shlGameOn, SWT.NONE);
		lblWaitingForPlayers.setAlignment(SWT.CENTER);
		lblWaitingForPlayers.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		lblWaitingForPlayers.setBounds(49, 225, 271, 37);
		lblWaitingForPlayers.setText("Waiting for players...");
		
		Label lblTimer = new Label(shlGameOn, SWT.NONE);
		lblTimer.setFont(SWTResourceManager.getFont("Segoe UI", 16, SWT.NORMAL));
		lblTimer.setAlignment(SWT.CENTER);
		lblTimer.setBounds(49, 109, 116, 45);
		lblTimer.setText("Timer: ");
		
		text = new Text(shlGameOn, SWT.BORDER);
		text.setBounds(171, 109, 110, 44);

	}

}
