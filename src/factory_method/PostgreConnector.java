package factory_method;

public class PostgreConnector implements DatabaseConnector {

	@Override
	public String getConnector() {
		return "POSTGRE CONNECTOR";
	}

}
