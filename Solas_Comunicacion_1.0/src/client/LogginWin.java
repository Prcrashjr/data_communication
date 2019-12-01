/*
 * Name:		LogginWin.java
 * Authors: 	Edwin A. Gonzalez Nieves 841-13-3060
 * 				Franklyn Muñiz xxx-xx-xxxx
 * Class:		Comunicacion de Datos - Prof. Juan M. Sola
 * Description: Handles the client loggin window
 */


package client;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.widgets.Composite;

public class LogginWin extends Thread {

	protected Shell shlWelcome;
	private Text txtUser;
	private Text txtIp;
	private Button btnEnterInfo;

	/**
	 * Launch the application.
	 * @param args
	 * @wbp.parser.entryPoint
	 */
	public void run() {
		try {
			LogginWin window = new LogginWin();
			window.open();
			System.out.println("flag3");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	/**
	 * Gets the string in the Ip Adress text box
	 * @return txtIp String
	 */
	public String getTxtIp() {
		System.out.println("flag4");
		return txtIp.getText();
	}



	/*
	 * Gets button
	 */
	public void setBtnEnterListener() {
		btnEnterInfo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("TESTINGGGGG");
			}
		});
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
		shlWelcome.setSize(720, 400);
		shlWelcome.setText("Welcome");

		Label lblWelcomeToFaking = new Label(shlWelcome, SWT.WRAP | SWT.CENTER);
		lblWelcomeToFaking.setFont(SWTResourceManager.getFont("Trebuchet MS", 12, SWT.BOLD));
		lblWelcomeToFaking.setBounds(163, 62, 341, 77);
		lblWelcomeToFaking.setText("FAKING IT");

		txtUser = new Text(shlWelcome, SWT.BORDER);
		txtUser.setBounds(114, 289, 203, 31);

		Label lblUsername = new Label(shlWelcome, SWT.WRAP | SWT.CENTER);
		lblUsername.setToolTipText("");
		lblUsername.setAlignment(SWT.CENTER);
		lblUsername.setBounds(10, 292, 98, 25);
		lblUsername.setText("Username : ");

		Label lblIpAdress = new Label(shlWelcome, SWT.WRAP | SWT.CENTER);
		lblIpAdress.setToolTipText("");
		lblIpAdress.setText("IP Adress:");
		lblIpAdress.setAlignment(SWT.CENTER);
		lblIpAdress.setBounds(10, 252, 98, 25);

		txtIp = new Text(shlWelcome, SWT.BORDER);
		txtIp.setText("algo");
		txtIp.setBounds(114, 252, 203, 31);

		btnEnterInfo = new Button(shlWelcome, SWT.NONE);
		btnEnterInfo.setText("Enter");
		btnEnterInfo.setBounds(353, 252, 75, 31);

		Button btnExit = new Button(shlWelcome, SWT.NONE);
		btnExit.setBounds(353, 292, 75, 30);
		btnExit.setText("Exit");

		CLabel lblDisconnected = new CLabel(shlWelcome, SWT.NONE);
		lblDisconnected.setFont(SWTResourceManager.getFont("Consolas", 8, SWT.NORMAL));
		lblDisconnected.setBounds(325, 0, 115, 31);
		lblDisconnected.setText("Disconnected");

		CLabel lblStatus = new CLabel(shlWelcome, SWT.NONE);
		lblStatus.setFont(SWTResourceManager.getFont("Consolas", 8, SWT.NORMAL));
		lblStatus.setText("Status: ");
		lblStatus.setBounds(257, 0, 62, 31);

		Button btnPlay = new Button(shlWelcome, SWT.NONE);
		btnPlay.setText("Play");
		btnPlay.setBounds(454, 252, 75, 68);

		CLabel lblNewLabel = new CLabel(shlWelcome, SWT.NONE);
		lblNewLabel.setBackground(SWTResourceManager.getImage("C:\\Users\\prcra\\Pictures\\fakeScale.png"));
		lblNewLabel.setBounds(553, 237, 122, 83);
		lblNewLabel.setText("");

	}
}
