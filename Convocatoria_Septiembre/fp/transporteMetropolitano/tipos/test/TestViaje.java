package fp.transporteMetropolitano.tipos.test;

import java.util.ArrayList;
import java.util.List;

import fp.transporteMetropolitano.tipos.Viaje;
import fp.transporteMetropolitano.tipos.ViajeImpl;

/**
 * 14 jun. 2016
 * @author Ubidragon
 *
 * ExamenesFp-1415
 */
public class TestViaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		casoPrueba();
	}

	private static void casoPrueba() {
		// TODO Auto-generated method stub
		
		
		List<String> l1= new ArrayList<String>();
		l1.add("Sevilla");
		l1.add("Malaga");
		l1.add("Murcia");
		l1.add("Barcelona");
		Viaje v = new ViajeImpl( l1 , 900.0, 1.5);
		
		System.out.println("trayecto: " + v.toString());
		
		
	}
	
	
	

}
