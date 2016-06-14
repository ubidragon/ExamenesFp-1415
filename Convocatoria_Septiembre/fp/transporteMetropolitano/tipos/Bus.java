package fp.transporteMetropolitano.tipos;

import java.time.LocalDate;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public interface Bus extends Comparable<Bus>{
	
	String getMatricula();
	LocalDate getFechaInicio();
	Integer getMaxPasajeros();
	Integer getAnyos();
	
	void setPasajeros(Integer pasajeros);
	

}
