package fr.KOOR.N.A.Swing_gestionFenetre;


import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
/**
 * GridLayout : SetSize & setBounds ignorés.
 *
 */
public class MyWindow3GridLayout extends JFrame{
	
	private static final long serialVersionUID = -6906441042070858585L;


	public MyWindow3GridLayout() {

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
		
		// Paramètres du nombre d'éléments par ligne et colonne, 
		// écart horizontal et vertical entre chaque composant
		contentPane.setLayout(new GridLayout(2,2,20,20));

		// Création des éléments
		JButton btnPushMe = new JButton ("Push me!");
		
		JButton btnClickMe = new JButton ("Click me!");
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!!!!!!!!!!");
		
		JTextField textEditMe = new JTextField("Edit me!");
		
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
		MyWindow3GridLayout myWindow = new MyWindow3GridLayout();
		myWindow.setVisible(true);
	}

}
