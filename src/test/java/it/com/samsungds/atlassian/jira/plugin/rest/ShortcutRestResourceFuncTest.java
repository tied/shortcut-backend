package it.com.samsungds.atlassian.jira.plugin.rest;

import com.samsungds.atlassian.jira.plugin.rest.ShortcutRestResourceModel;
import org.apache.wink.client.Resource;
import org.apache.wink.client.RestClient;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortcutRestResourceFuncTest {

    @Before
    public void setup() {

    }

    @After
    public void tearDown() {

    }

    @SuppressWarnings("SpellCheckingInspection")
    @Test
    public void messageIsValid() {

        String baseUrl = System.getProperty("baseurl");
        String resourceUrl = baseUrl + "/rest/shortcutrestresource/1.0/shortcut/message";

        RestClient client = new RestClient();
        Resource resource = client.resource(resourceUrl);

        ShortcutRestResourceModel message = resource.get(ShortcutRestResourceModel.class);

        assertEquals("wrong message", "Hello World", message.getMessage());
    }
}
