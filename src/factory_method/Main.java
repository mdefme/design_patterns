package factory_method;

public class Main {

	public static void main(String[] args) {
		
		DatabaseConnectorFactory databaseConnectorFactory = new DatabaseConnectorFactory();
		DatabaseConnector databaseConnector = databaseConnectorFactory.createDatabaseConnector("MARIADB");
		String result = databaseConnector.getConnector();
		System.out.println("Connected to "+result);

	}

}
