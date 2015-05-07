import javax.swing.*; 
import java.awt.event.*; 
import java.awt.*; 
import java.awt.image.*; 
import java.io.*; 
import javax.imageio.*; 

public class ImageEditorFrame extends JFrame{ 
	public ImageEditorFrame(){ 
		setTitle("ImageEditor Deluxe");
		setDefaultCloseOperation(EXIT_ON_CLOSE); 
		createMenuBar();
		setSize(400, 300); 
		setVisible(true);
	}

	private void createMenuBar(){ 
		JMenuBar menuBar = new JMenuBar(); 
		setJMenuBar(menuBar); 
		
		JMenu menuFile = new JMenu("File"); 
		menuBar.add(menuFile); 
		
		JMenuItem menuItemOpen = new JMenuItem("Open"); 
		menuFile.add(menuItemOpen); 
		
		menuItemOpen.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e){ 
				onOpen(); 
			}
		}); 
	}

	private void onOpen(){ 
		JOptionPane.showMessageDialog(this, "Open Selected"); 
	}
}