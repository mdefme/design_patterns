package factory_method;

public class DatabaseConnectorFactory {
	
	public DatabaseConnector createDatabaseConnector(String databaseType) {
		
		if(databaseType.equals("MARIADB")){
			return new MariaConnector();
		}
		
		else if (databaseType.equals("POSTGRE")) {
			return new PostgreConnector();
		}
		
		else return null;
		
	}
	
}
