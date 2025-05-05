package ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DatabaseRealAccessTest {
    private DatabaseRealAccess database;
    private DatabaseAccess databaseProxy1;
    private DatabaseAccess databaseProxy2;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
        this.databaseProxy1 = new ProtectionProxyDatabase(this.database, 1234);
        this.databaseProxy2 = new ProtectionProxyDatabase(this.database, 3456);
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
    
    @Test
    public void testGetSearchResultsWithProxy() {
    	assertEquals(Arrays.asList("Spiderman", "Marvel"), this.databaseProxy1.getSearchResults("select * from comics where id=1"));
    	assertEquals(null, this.databaseProxy2.getSearchResults("select * from comics where id=1"));
    }
    
    @Test
    void testInsertNewRowWithProxy() {
        assertEquals(3, this.databaseProxy1.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.databaseProxy1.getSearchResults("select * from comics where id=3"));
        assertEquals(-1, this.databaseProxy2.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
    }
}