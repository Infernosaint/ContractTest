/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static com.google.common.collect.Range.greaterThan;
import static com.mycompany.contracttest.BackendHolder.manager;
import generalstuff.DepartureDetail;
import generalstuff.DepartureIdentifier;
import generalstuff.LineIdentifier;
import generalstuff.ReservationDetail;
import generalstuff.ReservationIdentifier;
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

        assumeThat(departures, not(nullValue()));
        assumeTrue(departures.size() >= 1);
        String customerName = "Mads";
        DepartureIdentifier depId = new DepartureIdentifier(departures.iterator().next().getId());
        ReservationDetail resDet = manager.saveReservation(depId, 1, 1, 1, 0, 0, customerName);
        
        assertEquals(resDet.getCustomerName(), customerName);
    }
    
    @Test
    public void testUpdateReservation() {
        assumeThat(manager, not(nullValue()));

        Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());

        assumeThat(departures, not(nullValue()));
        assumeTrue(departures.size() >= 1);
        String customerName = "Kaloyan";
        DepartureIdentifier depId = new DepartureIdentifier(departures.iterator().next().getId());
        ReservationDetail resDet = manager.saveReservation(depId, 2, 3, 1, 0, 0, customerName);
        System.out.println(resDet.getId());
        assertEquals(resDet.getCustomerName(), customerName);
        customerName = "Mads";
        resDet = manager.updateReservation(new ReservationIdentifier(resDet.getId()), depId, 0, 0, 0, 0, 0, customerName);
        assertEquals(resDet.getCustomerName(), customerName);
        assertEquals(customerName, manager.getReservation(new ReservationIdentifier(resDet.getId())).getCustomerName());
    }
}
