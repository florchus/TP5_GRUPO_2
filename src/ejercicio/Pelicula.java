package ejercicio;

public class Pelicula implements Comparable<Pelicula>{
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pelicula other = (Pelicula) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public int compareTo(Pelicula o) {	
		
		return this.nombre.compareTo(o.getNombre());
	
		
	}	
	
	
	
}
