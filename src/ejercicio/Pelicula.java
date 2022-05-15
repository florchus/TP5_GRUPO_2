package ejercicio;

public class Pelicula {
	private int id;
	private String nombre;
	private Categoria genero;
	
	private static int cont = 0;
	
	public Pelicula() {
		cont++;
		this.id = cont;
	}
	
	public Pelicula(int id, String nombre, Categoria genero) {
		cont++;
		this.id = cont;
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getGenero() {
		return genero;
	}

	public void setGenero(Categoria genero) {
		this.genero = genero;
	}

	public int getId() {
		return id;
	}

	public static int getCont() {
		return cont;
	}

	public static void setCont(int cont) {
		Pelicula.cont = cont;
	}

	@Override
	public String toString() {
		return id + " - " + nombre + " - " + genero.getNombre();
	}	
	
}
