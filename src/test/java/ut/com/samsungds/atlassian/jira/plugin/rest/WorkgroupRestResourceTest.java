package ut.com.samsungds.atlassian.jira.plugin.rest;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.mockito.Mockito;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import com.samsungds.atlassian.jira.plugin.rest.ShortcutRestResource;
import com.samsungds.atlassian.jira.plugin.rest.ShortcutRestResourceModel;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.GenericEntity;

public class ShortcutRestResourceTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @Test
    public void messageIsValid() {
        /*
        ShortcutRestResource resource = new ShortcutRestResource();

        Response response = resource.getMessage();
        final ShortcutRestResourceModel message = (ShortcutRestResourceModel) response.getEntity();

        assertEquals("wrong message","Hello World",message.getMessage());

         */
    }
}
