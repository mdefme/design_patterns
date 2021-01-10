package factory_method;

public class MariaConnector implements DatabaseConnector {

	@Override
	public String getConnector() {
		return "MARIADB CONNECTOR";
	}

}
