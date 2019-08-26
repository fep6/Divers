package fr.KOOR.swing;

// https://www.youtube.com/watch?v=-UvxwleNA20&t=221s
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
/**
 * BorderLayout
 * TextArea	
 */
public class MyWindow4BorderLayout extends JFrame{
	
	private static final long serialVersionUID = -6906441042070858585L;


	public MyWindow4BorderLayout() {

		super( "Ma nouvelle application Swing" );
		//Pour terminerl'application (à la fermeture de la fenêtre)
		// Contrairement à EXIT_ON_CLOSE, DISPOSE_ON_CLOSE permet de ne pas tout fermer
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Parametrage de la fenêtre
		this.setSize(600,400);
		// Le centrage doit de faire après la taille de la fenêtre
		this.setLocationRelativeTo(null);
		
		//permet d'avoir le contenu principal de la fenêtre (au delà du bandeau supérieur et de la barre de menu)
		JPanel contentPane = (JPanel) this.getContentPane();
		
		// 
		contentPane.setLayout(new BorderLayout());

		// Création des éléments
		JButton btnPushMe = new JButton ("Push me!");
		JButton btnClickMe = new JButton ("Click me!");
		JCheckBox chkCheckMe = new JCheckBox("Check me!!!!!!!!!!");
		JTextArea textArea = new JTextArea("TextArea");
		
		//Affichage boutons (BorderLayout.NORTH et SOUTH prend toute la largeur
		// et se cale sur le contenu pour la hauteur
		// C'est l'inverse pour EAST et WEST
		contentPane.add(btnPushMe,BorderLayout.NORTH);
		// Le btnClickme est fixé à 200, le textArea prend le reste de la largeur 
		// (perte de la responsivité sur cette ligne)
		btnClickMe.setPreferredSize(new Dimension(200,0));
		contentPane.add(btnClickMe,BorderLayout.WEST);
		contentPane.add(chkCheckMe,BorderLayout.SOUTH);
		contentPane.add(textArea);
		
	}
	
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		
		// Application du look nimbus
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		//Début de la création de fenêtre
		MyWindow4BorderLayout myWindow = new MyWindow4BorderLayout();
		myWindow.setVisible(true);
	}

}
