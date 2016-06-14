package fp.transporteMetropolitano.tipos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public class BusImpl implements Bus {
	
	/************* ATRIBUTOS *****************/
	
	private String matricula;
	private LocalDate fechaInicio;
	private Integer pasajeros;
	private static final Integer MAX_PASAJEROS = 100;
	
	/************* CONSTRUCTORES *****************/
	
	public BusImpl(String matricula, LocalDate fechaInicio, Integer pasajeros ){
		
		checkNotNull(matricula);
		checkNotNull(fechaInicio);
		checkNotNull(pasajeros);
		checkFechaInicio(fechaInicio);
		checkNumeroMaximoPasajeros (pasajeros);

		this.matricula = matricula;
		this.fechaInicio = fechaInicio;
		this.pasajeros = pasajeros;
		
		
	}
	
	public BusImpl(String bus){
		
		//Troceamos la cadena con split
		String[] trozos = bus.split("#");
		
		//Verificamos que tiene la longitud adecuada
		if (trozos.length != 3) {
		throw new IllegalArgumentException(
		"El formato de la cadena de entrada no es correcto.");
		}
		
		//Trimeamos y contruimos los objetos
		String matricula = trozos[0].trim();
		LocalDate fecha = LocalDate.parse(trozos[1].trim(),
		DateTimeFormatter.ofPattern("d/M/y"));
		Integer maxPasajeros= new Integer(trozos[2].trim());
		
		//Comprobamos de nuevo los chekcs
		checkNotNull(matricula);
		checkNotNull(fecha);
		checkNotNull(maxPasajeros);
		checkFechaInicio(fecha);
		checkNumeroMaximoPasajeros(maxPasajeros);
		
		//Copiamos los atributos de nuevo
		this.matricula = matricula;
		this.fechaInicio = fecha;
		this.pasajeros = maxPasajeros;
		}

	
	/*********EXCEPCIONES*************/
	
	private void checkNotNull(Object o) {
		if (o == null) {
			throw new IllegalArgumentException();
		}
	}

	private void checkFechaInicio(LocalDate fecha) {
		if (!fecha.isBefore(LocalDate.now())) {
			throw new IllegalArgumentException();
		}
	}

	private void checkNumeroMaximoPasajeros(Integer max) {
		if (max <= 0 || max > MAX_PASAJEROS) {
			throw new IllegalArgumentException();
		}
	}

	/********GETTERS & SETTERS*************/
	
	
	public String getMatricula() {
		
		return matricula;
	}

	
	public LocalDate getFechaInicio() {
	
		return fechaInicio;
	}

	
	public Integer getAnyos() {
		
			return (int)getFechaInicio().until(LocalDate.now(),ChronoUnit.YEARS);
			
	}
	
	public Integer getMaxPasajeros() {
		
		return pasajeros;
	}
	
	public void setPasajeros(Integer p) {
		checkNumeroMaximoPasajeros(p);
		pasajeros = p;
		}

	/********EQUALS HASHCODE COMPARETO*************/
	
	public int hashCode() {
		
		return getMatricula().hashCode()*31;
		
	}

	
	public boolean equals(Object o) {
	
		boolean result = false;

		if (o instanceof Bus) {

			Bus c = (Bus) o;
			result = this.getMatricula().equals(c.getMatricula());

		}

		return result;

	}
	
	public int compareTo(Bus b) {
		
		int res = getMatricula().compareTo(b.getMatricula());
		return res;
		
	}
	
	/********TOSTRING*************/
	
	public String toString(){
		return getMatricula();
	}
	
}
