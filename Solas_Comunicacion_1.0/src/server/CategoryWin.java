package server;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.List;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.custom.CCombo;

public class CategoryWin {

	protected Shell shlRounds;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CategoryWin window = new CategoryWin();
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
		shlRounds.open();
		shlRounds.layout();
		while (!shlRounds.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlRounds = new Shell();
		shlRounds.setSize(1271, 716);
		shlRounds.setText("Rounds");
		
		Label lblRound = new Label(shlRounds, SWT.WRAP | SWT.CENTER);
		lblRound.setAlignment(SWT.CENTER);
		lblRound.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblRound.setBounds(116, 112, 461, 175);
		lblRound.setText("Round : ");
		
		Label label = new Label(shlRounds, SWT.BORDER | SWT.WRAP | SWT.SHADOW_IN | SWT.CENTER);
		label.setFont(SWTResourceManager.getFont("Segoe UI", 42, SWT.NORMAL));
		label.setBounds(943, 149, 199, 115);
		label.setText("#");
		
		Label lblCategoria = new Label(shlRounds, SWT.WRAP | SWT.CENTER);
		lblCategoria.setText("Categoria : ");
		lblCategoria.setFont(SWTResourceManager.getFont("Segoe UI", 60, SWT.NORMAL));
		lblCategoria.setAlignment(SWT.CENTER);
		lblCategoria.setBounds(116, 350, 604, 181);
		
		Label lblNewLabel = new Label(shlRounds, SWT.BORDER | SWT.WRAP);
		lblNewLabel.setFont(SWTResourceManager.getFont("Segoe UI", 32, SWT.BOLD));
		lblNewLabel.setBounds(770, 408, 388, 88);
		lblNewLabel.setText("New Label");

	}
}
