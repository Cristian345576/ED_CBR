package ED_CBR;
//Autor Cristian
public class CBR_GavedadPlaneta {
	// Getter y Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getGravedadPlaneta() {
		return GravedadPlaneta;
	}
	public void setGravedadPlaneta(double gravedadPlaneta) {
		GravedadPlaneta = gravedadPlaneta;
	}
	// String
	@Override
	public String toString() {
		return "CBR_GavedadPlaneta [id=" + id + ", nombre=" + nombre + ", GravedadPlaneta=" + GravedadPlaneta + "]";
	}
	private int id;
	private String nombre;
	private double GravedadPlaneta;
//hefdhedh
}
