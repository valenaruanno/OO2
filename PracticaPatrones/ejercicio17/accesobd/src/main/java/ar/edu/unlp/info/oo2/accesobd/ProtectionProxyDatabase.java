package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class ProtectionProxyDatabase implements DatabaseAccess{
	private DatabaseRealAccess databaseRealAccess;
	private int databasePassword = 1234;
	private int password;

	
	public ProtectionProxyDatabase(DatabaseRealAccess databaseRealAccess, int password) {
		this.databaseRealAccess = databaseRealAccess;
		this.password = password;
	}

	private boolean usserChecked () {
		return databasePassword == password;
	}
	@Override
	public Collection<String> getSearchResults(String queryString) {
		if (usserChecked())
			return this.databaseRealAccess.getSearchResults(queryString);
		else
			return null;
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if (usserChecked())
			return this.databaseRealAccess.insertNewRow(rowData);
		else
			return -1;
	}
	
}
