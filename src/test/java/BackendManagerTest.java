/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
  public void testListMembers() {
    assumeThat(manager, not(nullValue()));
    
    Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());
    
    assertThat(departures, not(nullValue()));
    assertThat(departures.iterator().next(), not(nullValue()));
    }
  @Test
  public void testListMembers2() {
    assumeThat(manager, not(nullValue()));
    
    Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());
    
    assertEquals(departures.size(), 4);
    }
  @Test
  public void testListMembers4() {
    assumeThat(manager, not(nullValue()));
    
    Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());
    
    assertEquals(departures.size(), 4);
    }
  @Test
  public void testListMembers3() {
    assumeThat(manager, not(nullValue()));
    
    Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());
    
    assertEquals(departures.size(), 4);
    }
  @Test
  public void testListMembers1() {
    assumeThat(manager, not(nullValue()));
    
    Collection<DepartureDetail> departures = manager.getDepartures(new LineIdentifier(1), new Date());
    
    assertEquals(departures.size(), 4);
    }
  
    
}
