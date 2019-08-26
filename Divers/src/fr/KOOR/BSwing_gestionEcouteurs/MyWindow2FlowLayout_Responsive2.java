package fr.KOOR.BSwing_gestionEcouteurs;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
/**
 * 
 * setPreferredSize(x,y);
 * Ajout constantes pour FlowLayout
 *
 */
public class MyWindow2FlowLayout_Responsive2 extends JFrame{
	
	private static final long serialVersionUID = -6906441042070858585L;


	public MyWindow2FlowLayout_Responsive2() {

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
		
		// Paramètres 100 & 300 donnent un espace par défaut entre chaque élément
		contentPane.setLayout(new FlowLayout(FlowLayout.RIGHT,20,2));

		// Création des éléments
		JButton btnPushMe = new JButton ("Push me!");
		btnPushMe.setPreferredSize(new Dimension (120,30));
		
		
		
		JButton btnClickMe = new JButton ("Click me!");
		btnClickMe.setPreferredSize(new Dimension (120,30));
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!!!!!!!!!!");
		chkCheckMe.setPreferredSize(new Dimension (120,30));
		
		JTextField textEditMe = new JTextField("Edit me!");
		textEditMe.setPreferredSize(new Dimension (120,30));
		
		//Affichage boutons
		contentPane.add(btnPushMe);
		contentPane.add(btnClickMe);
		contentPane.add(chkCheckMe);
		contentPane.add(textEditMe);
		
	}
	
	public static void main(String[] args) throws UnsupportedLookAndFeelException {
		
		// Application du look nimbus
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
		
		//Début de la création de fenêtre
		MyWindow2FlowLayout_Responsive2 myWindow = new MyWindow2FlowLayout_Responsive2();
		myWindow.setVisible(true);
	}

}
