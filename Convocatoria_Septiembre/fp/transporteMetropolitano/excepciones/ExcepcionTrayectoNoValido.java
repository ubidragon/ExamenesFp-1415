package fp.transporteMetropolitano.excepciones;

public class ExcepcionTrayectoNoValido extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionTrayectoNoValido() {

		super();

	}

	public ExcepcionTrayectoNoValido(String string) {

		super(string);

	}

}