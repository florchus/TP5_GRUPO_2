package ejercicio;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

public class PanelAgregarPelicula extends JPanel {
	private JTextField txtNombre;
	private JLabel lblId;
	private JLabel lblIdAuto;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private DefaultListModel<Pelicula> dlModel;
	private JComboBox<Categoria> cbGenero;
	private JButton btnAceptar;
	
	public void setDlModel(DefaultListModel<Pelicula> dlModel) {
		this.dlModel = dlModel;
	}

	/**
	 * Create the panel.
	 */
	public PanelAgregarPelicula() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		

		lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblId = new GridBagConstraints();
		gbc_lblId.insets = new Insets(0, 0, 5, 5);
		gbc_lblId.gridx = 3;
		gbc_lblId.gridy = 2;
		add(lblId, gbc_lblId);
		
		lblIdAuto = new JLabel("");
		GridBagConstraints gbc_lblIdAuto = new GridBagConstraints();
		gbc_lblIdAuto.anchor = GridBagConstraints.WEST;
		gbc_lblIdAuto.insets = new Insets(0, 0, 5, 5);
		gbc_lblIdAuto.gridx = 6;
		gbc_lblIdAuto.gridy = 2;
		Pelicula pelicula = new Pelicula();
		lblIdAuto.setText(Integer.toString(pelicula.getId()));
		add(lblIdAuto, gbc_lblIdAuto);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 3;
		gbc_lblNombre.gridy = 4;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNombre.gridx = 6;
		gbc_txtNombre.gridy = 4;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblGenero = new GridBagConstraints();
		gbc_lblGenero.insets = new Insets(0, 0, 5, 5);
		gbc_lblGenero.gridx = 3;
		gbc_lblGenero.gridy = 6;
		add(lblGenero, gbc_lblGenero);
		
		cbGenero = new JComboBox<Categoria>();
		cbGenero.setToolTipText("Seleccione un g\u00E9nero");
		GridBagConstraints gbc_cbGenero = new GridBagConstraints();
		gbc_cbGenero.insets = new Insets(0, 0, 5, 5);
		gbc_cbGenero.fill = GridBagConstraints.HORIZONTAL;
		gbc_cbGenero.gridx = 6;
		gbc_cbGenero.gridy = 6;
		cbGenero.addItem(new Categoria(0, "Seleccione un género"));
		cbGenero.addItem(new Categoria(1, "Terror"));
		cbGenero.addItem(new Categoria(2, "Accion"));
		cbGenero.addItem(new Categoria(3, "Suspenso"));
		cbGenero.addItem(new Categoria(4, "Romántica"));
		add(cbGenero, gbc_cbGenero);
		
		btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.gridx = 7;
		gbc_btnAceptar.gridy = 8;
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		

				if (cbGenero.getSelectedIndex() != 0 && !txtNombre.getText().isEmpty()) {
					pelicula.setNombre(txtNombre.getText());
					pelicula.setGenero((Categoria)cbGenero.getSelectedItem());
					dlModel.addElement(pelicula);
					JOptionPane.showMessageDialog(null, "Película añadida con éxito.");
				}
				else {
					String msjError = new String();
					if (cbGenero.getSelectedIndex() == 0) {
						msjError = "* Debe seleccionar un género de película. ";
					}
					if (txtNombre.getText().isEmpty()) {
						msjError += "\n* Debe ingresar un nombre de película.";
					}
					JOptionPane.showMessageDialog(null, msjError);
				}

				
			}

		});
		add(btnAceptar, gbc_btnAceptar);
	}
	public void setDlmListaPeliculas(DefaultListModel<Pelicula>dlModel ) {
		this.dlModel = dlModel;
	}
}
