package fr.KOOR.N.A.Swing_gestionFenetre;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MyWindow_NonResponsive extends JFrame{
	
	private static final long serialVersionUID = -6906441042070858585L;


	public MyWindow_NonResponsive() {

		super( "Ma nouvelle application Swing" );
		//Pour terminerl'application (à la fermeture de la fenêtre)
		// Contrairement à EXIT_ON_CLOSE (ferme toute les fenetre), ou HIDE_ON_CLOSE (continue de faire tourner la JVM),
		//DISPOSE_ON_CLOSE permet de ne pas tout fermer
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// Parametrage de la fenêtre
		this.setSize(600,400);
		// Le centrage doit de faire après la taille de la fenêtre
		this.setLocationRelativeTo(null);
		
		//permet d'avoir le contenu principal de la fenêtre (au delà du bandeau supérieur et de la barre de menu)
		JPanel contentPane = (JPanel) this.getContentPane();
		//permet de positionner des widgets à l'interieur d'un container (contentPane)
		//Positionne donc les éléments de la fenêtre en ligne de manière responsive
		
		contentPane.setLayout(null);

		// Création des éléments
		
		JButton btnPushMe = new JButton ("Push me!");
		// btnPushMe.setBounds(Pos x, Pos y, int width, int height);
		btnPushMe.setBounds(200,20,160,30);
		
		JButton btnClickMe = new JButton ("Click me!");
		btnClickMe.setBounds(200,70,160,30);
		
		JCheckBox chkCheckMe = new JCheckBox("Check me!!!!!!!!!!");
		chkCheckMe.setBounds(200,120,160,30);
		
		JTextField textEditMe = new JTextField("Edit me!");
		textEditMe.setBounds(200,170,160,30);
		
		
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
		MyWindow_NonResponsive myWindow_NonResponsive = new MyWindow_NonResponsive();
		myWindow_NonResponsive.setVisible(true);
	}

}
