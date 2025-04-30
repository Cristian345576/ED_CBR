package ED_CBR;
//vesion 1.0
//Autor Cristian

public class Persona_CBR {
	//Getter y Setter
	public class Persona {
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getNombre() {
			return nombre;
		}
		public void setNombre(int nombre) {
			this.nombre = nombre;
		}
		public double getMasa() {
			return masa;
		}
		public void setMasa(double masa) {
			this.masa = masa;
		}
		public double getAltura() {
			return altura;
		}
		public void setAltura(double altura) {
			this.altura = altura;
		}
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
	//El String
		@Override
		public String toString() {
			return "Persona [id=" + id + ", nombre=" + nombre + ", masa=" + masa + ", altura=" + altura + ", edad="
					+ edad + "]";
		}
		private int id;
		private int nombre;
		private double masa;
		private double altura;
		private int edad;
	}

}
