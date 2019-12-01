package server;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.custom.SashForm;

public class ScoreBoardWin {

	protected Shell shlUserPoints;
	private List listPoints;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ScoreBoardWin window = new ScoreBoardWin();
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
		shlUserPoints.open();
		shlUserPoints.layout();
		while (!shlUserPoints.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlUserPoints = new Shell();
		shlUserPoints.setSize(486, 445);
		shlUserPoints.setText("User Points");
		
		listPoints = new List(shlUserPoints, SWT.BORDER | SWT.H_SCROLL);
		listPoints.setBounds(49, 71, 338, 210);
		
		Label lblTopPlayer = new Label(shlUserPoints, SWT.NONE);
		lblTopPlayer.setBounds(38, 314, 105, 25);
		lblTopPlayer.setText("Top Player :");
		
		Label lblNewLabel = new Label(shlUserPoints, SWT.NONE);
		lblNewLabel.setBounds(149, 314, 119, 25);
		lblNewLabel.setText("_________________");
		
		Label lblUserScores = new Label(shlUserPoints, SWT.NONE);
		lblUserScores.setBounds(163, 27, 105, 25);
		lblUserScores.setText("Score Board");

	}
}
