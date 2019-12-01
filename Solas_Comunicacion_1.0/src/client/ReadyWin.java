package client;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import javax.swing.ImageIcon;
import org.eclipse.swt.widgets.Button;

public class ReadyWin {

	protected Shell shlQuestionWindows;
	private Text txtQuestion;
	/**
	 * @wbp.nonvisual location=328,269
	 */
	private final ImageIcon imageIcon = new ImageIcon();

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ReadyWin window = new ReadyWin();
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
		shlQuestionWindows.open();
		shlQuestionWindows.layout();
		while (!shlQuestionWindows.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlQuestionWindows = new Shell();
		shlQuestionWindows.setSize(457, 449);
		shlQuestionWindows.setText("Question Windows");
		
		txtQuestion = new Text(shlQuestionWindows, SWT.BORDER);
		txtQuestion.setText("PREGUNTAA");
		txtQuestion.setBounds(42, 87, 329, 87);
		
		Button btnReady = new Button(shlQuestionWindows, SWT.NONE);
		btnReady.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnReady.setBounds(123, 283, 151, 42);
		btnReady.setText("Ready");

	}

}
