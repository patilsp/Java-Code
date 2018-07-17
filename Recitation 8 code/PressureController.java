import com.phidgets.*;
import com.phidgets.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PressureController extends JFrame {
	private InterfaceKitPhidget	interfaceKit;

	public static void main(String[] args) {
		PressureController pc = new PressureController();
		pc.setSize(100, 100);	// Blank GUI for now
		pc.setVisible(true);
		pc.openIntfcKit();
	}

	public PressureController() {	// Close Phidget intfc kit on exit
		// WindowListener interface has 7 methods
		// WindowAdapter has empty method bodies for all
		// Override only the needed one(s)
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {closeIntfcKit();}
		});
	}

	private void openIntfcKit() {
		try {
			interfaceKit = new InterfaceKitPhidget();
			interfaceKit.addErrorListener(new ErrorListener() {
				public void error(ErrorEvent ee) {
					System.out.println("Error event for " + ee);
				}
			});
			interfaceKit.addSensorChangeListener(new SensorChangeListener() {
				public void sensorChanged(SensorChangeEvent se) {
					System.out.println(se);
				}
			});
			interfaceKit.openAny();				// Open first sensor found
			System.out.println("Waiting for PressureSensor attachment...");
			interfaceKit.waitForAttachment();	// Wait for it to be available
			interfaceKit.setRatiometric(true);
			while (!interfaceKit.getRatiometric());		// Confirm ratiometric
		} catch (PhidgetException pe) {
			System.err.println(pe);
		}
	}

	private void closeIntfcKit() {
		System.out.println("Closing...");
		try { 
			interfaceKit.close(); }
		catch (PhidgetException pe) { 
			System.err.println(pe); }
		interfaceKit = null;
		System.exit(0);
	}
}