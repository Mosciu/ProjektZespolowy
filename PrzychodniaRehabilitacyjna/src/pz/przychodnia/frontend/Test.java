package pz.przychodnia.frontend;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Canvas;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.custom.CCombo;
import org.eclipse.swt.widgets.Label;

public class Test {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Test window = new Test();
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
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		
		Canvas canvas = new Canvas(shell, SWT.NONE);
		canvas.setBounds(10, 0, 140, 124);
		
		StyledText styledText = new StyledText(shell, SWT.BORDER);
		styledText.setBounds(230, 48, 69, 19);
		
		CCombo combo = new CCombo(shell, SWT.BORDER);
		combo.setBounds(326, 67, 31, 21);
		
		Label lblPe = new Label(shell, SWT.NONE);
		lblPe.setBounds(240, 73, 55, 15);
		lblPe.setText("P\u0142e\u0107");

	}
	
}
