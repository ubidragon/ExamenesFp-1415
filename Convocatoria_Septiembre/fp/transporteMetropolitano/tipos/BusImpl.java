package fp.transporteMetropolitano.tipos;

import java.time.LocalDate;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public class BusImpl implements Bus {
	
	private String matricula;
	private LocalDate fechaInicio;
	private Integer pasajeros;
	private static final Integer MAX_PASAJEROS = 100;
	
	public BusImpl(String matricula, LocalDate fechaInicio, Integer pasajeros ){
		
		checkNotNull(matricula);
		checkNotNull(fechaInicio);
		checkNotNull(pasajeros);
		checkfechaInicio(fechaInicio);
		checkNumeroMaximoPasajeros (pasajeros);

		this.matricula = matricula;
		this.fechaInicio = fechaInicio;
		this.pasajeros = pasajeros;
		
		
	}
	
	/*********EXCEPCIONES*************/
	
	private void checkNotNull(Object o) {
		if (o == null) {
			throw new IllegalArgumentException();
		}
	}

	private void checkfechaInicio(LocalDate fecha) {
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
	
	@Override
	public String getMatricula() {
		// TODO Auto-generated method stub
		return matricula;
	}

	@Override
	public LocalDate getFechaInicio() {
		// TODO Auto-generated method stub
		return fechaInicio;
	}

	@Override
	public Integer getAnyos() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Integer getMaxPasajeros() {
		// TODO Auto-generated method stub
		return pasajeros;
	}
	
	public void setPasajeros(Integer p) {
		checkNumeroMaximoPasajeros(p);
		pasajeros = p;
		}
	

}
