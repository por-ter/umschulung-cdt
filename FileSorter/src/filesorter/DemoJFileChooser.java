package filesorter;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.util.*;

public class DemoJFileChooser extends JPanel implements ActionListener {
    JButton go;
    JFileChooser chooser;
    String choosertitle;

    public DemoJFileChooser() {
        go = new JButton("Organise Directory");
        go.addActionListener(this);
        add(go);
    }

    public void actionPerformed(ActionEvent e) {
        chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("C:\\Users\\d.porter\\Documents")); // dir will go here
        File destinationDir = new File("C:\\Users\\d.porter\\Documents\\!ZumTesten");
        chooser.setDialogTitle(choosertitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //    
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            System.out.println("getCurrentDirectory(): "
                    + chooser.getCurrentDirectory());            
            System.out.println("getSelectedFile() : "
                    + chooser.getSelectedFile());
            
            File currentDirectory = chooser.getSelectedFile();
            Montagsnah.organiseDir(currentDirectory, destinationDir);
            
        } else {
            System.out.println("No Selection ");
        }
        
        System.out.println("TEST1");
//        chooser.setDialogTitle("SECONDASDASDAD");
        
    }

    public Dimension getPreferredSize() {
        return new Dimension(200, 200);
    }

    public static void main(String s[]) {
        JFrame frame = new JFrame("");
        DemoJFileChooser panel = new DemoJFileChooser();
        frame.addWindowListener(
                new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        }
        );
        frame.getContentPane().add(panel, "Center");
        frame.setSize(panel.getPreferredSize());
        frame.setVisible(true);
    }
}
