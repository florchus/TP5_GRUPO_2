package ejercicio;

import javax.swing.JPanel;
import javax.swing.ListModel;

import Ejercicio.Peliculas;
import javafx.collections.transformation.SortedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;

import java.util.Comparator;

import java.util.*;
import javax.swing.JLabel;



public class PanelListarPelicula extends JPanel {
	
	private DefaultListModel<Pelicula> dlModel;
	/**
	 * Create the panel.
	 */
	
	
	public PanelListarPelicula(DefaultListModel<Pelicula>listaModelRecibido) {
		setLayout(null);
		
		JList<Pelicula> list = new JList();
		list.setBounds(96, 28, 323, 241);
		add(list);
		
		ArrayList<Pelicula> lista= Collections.list(listaModelRecibido.elements());
		
		Collections.sort(lista);
			
		listaModelRecibido.clear();
		
		for (Pelicula pelicula : lista) {
			listaModelRecibido.addElement(pelicula);
		}
		
		list.setModel(listaModelRecibido);
		
		JLabel lblPeliculas = new JLabel("Peliculas ");
		lblPeliculas.setBounds(10, 149, 62, 14);
		add(lblPeliculas);
		
	}
}
