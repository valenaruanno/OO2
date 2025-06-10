package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.logging.Logger;
import java.util.List;

public class ProtectionProxyDatabase implements DatabaseAccess{
	private DatabaseRealAccess databaseRealAccess;
	private int databasePassword = 1234;
	private int password;
	private static final Logger logger = Logger.getLogger(ProtectionProxyDatabase.class.getName());

	
	public ProtectionProxyDatabase(DatabaseRealAccess databaseRealAccess, int password) {
		this.databaseRealAccess = databaseRealAccess;
		this.password = password;
	}

	private boolean usserChecked () {
		return databasePassword == password;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (usserChecked()) {
			logger.info("Acceso valido para busquedas");
			return this.databaseRealAccess.getSearchResults(queryString);
		}else {
			logger.severe("Acceso invalido para busquedas");
			return null;
		}
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (usserChecked()) {
			logger.warning("Acceso valido para inserciones");
			return this.databaseRealAccess.insertNewRow(rowData);
		}else {
			logger.severe("Acceso invalido para inserciones");
			return -1;
		}
	}
	
}
