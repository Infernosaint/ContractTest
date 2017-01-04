/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.google.common.collect.Range.greaterThan;
import static com.mycompany.contracttest.BackendHolder.manager;
import generalstuff.DepartureDetail;
import generalstuff.LineIdentifier;
import java.util.Collection;
import java.util.Date;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assume.*;

public class BackendManagerTest {

    @Test
    public void testGetDepartures() {
        assumeThat(manager, not(nullValue()));

        Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());

        assertThat(departures, not(nullValue()));
        assertTrue(departures.size() >= 1);
    }

    @Test
    public void testSaveReservation() {
        assumeThat(manager, not(nullValue()));

        Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());

        assertThat(departures, not(nullValue()));
        assertTrue(departures.size() >= 1);
    }
    @Test
    public void testUpdateReservation() {
        assumeThat(manager, not(nullValue()));

        Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());

        assertThat(departures, not(nullValue()));
        assertTrue(departures.size() >= 1);
    }
}
