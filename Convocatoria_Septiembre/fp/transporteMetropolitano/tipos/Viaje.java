package fp.transporteMetropolitano.tipos;

import java.util.List;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public interface Viaje {
	
	List<String> getTrayecto();
	Double getDistanciaTotal();
	Double getTiempoTotal();
	Double getVelocidad();

	void setTrayecto(List<String> trayecto);
	void setDistancia(Double distancia);	
	void setTiempo(Double tiempo);

}
