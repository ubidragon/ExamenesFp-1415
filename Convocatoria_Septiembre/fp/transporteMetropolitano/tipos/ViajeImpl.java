package fp.transporteMetropolitano.tipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.xml.bind.ParseConversionEvent;

import fp.transporteMetropolitano.excepciones.ExcepcionTrayectoNoValido;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public class ViajeImpl implements Viaje {
	
	/************* ATRIBUTOS *****************/
	
	private List<String> trayecto;
	private Double distancia;
	private Double tiempo;
	
	/************* CONSTRUCTORES *****************/
	
	public ViajeImpl(List<String> trayecto, Double distancia, Double tiempo){
		
		this.trayecto = trayecto;
		this.distancia = distancia;
		this.tiempo = tiempo;
		
	}
	
	public ViajeImpl(String s){
		
		String[] trozos = s.split("#");
		
		
	if(trozos.length != 3){
		throw new IllegalArgumentException(
				"El formato de la cadena de entrada no es correcto.");
				}
	List<String> trayecto = Arrays.asList(trozos[0].trim());
	Double distancia = new Double(trozos[1].trim());
	Double tiempo = new Double(trozos[2].trim());
	
	checkTrayecto(trayecto);	
		
	this.trayecto = trayecto;
	this.distancia = distancia;
	this.tiempo = tiempo;
	
	}
	
	/************* EXCEPCIONES *****************/

	private void checkTrayecto(List<String> trayecto){
		if(trayecto.size() < 2){
			throw new ExcepcionTrayectoNoValido("El trayecto es demasiado corto");
		}
	}

	/************* GETTERS & SETTERS *****************/
	
	public List<String> getTrayecto() {
		
		return new ArrayList<String>(trayecto);
		
	}

	public Double getDistanciaTotal() {

		return distancia;
		
	}

	public Double getTiempoTotal() {
		
		return tiempo;
		
	}
	
	public Double getVelocidad() {
		// vm = velocidad media
		Double vm = this.distancia/this.tiempo;
		return vm;
	}

	public void setTrayecto(List<String> trayecto) {
		// TODO Auto-generated method stub
		
	}

	public void setDistancia(Double distancia) {
		// TODO Auto-generated method stub
		
	}

	public void setTiempo(Double tiempo) {
		// TODO Auto-generated method stub
		
	}

/********EQUALS HASHCODE COMPARETO*************/
	
	public int hashCode() {
		
		return getTrayecto().hashCode()*31;
		
	}

	
	public boolean equals(Object o) {
	
		boolean result = false;

		if (o instanceof Viaje) {

			Viaje c = (Viaje) o;
			result = this.getTrayecto().equals(c.getTrayecto());

		}

		return result;

	}
	
	/********TOSTRING*************/
	
	public String toString(){
		
		return trayecto.toString();
	}


}
