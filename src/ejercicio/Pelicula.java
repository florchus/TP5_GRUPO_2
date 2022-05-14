package ejercicio;

public class Pelicula {
	private int id;
	private String nombre;
	private Categoria genero;
	
	public Pelicula() {

	}
	
	public Pelicula(int id, String nombre, Categoria genero) {
		this.id = id;
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

	@Override
	public String toString() {
		return id + " - " + nombre + " - " + genero.getNombre();
	}	
	
}
