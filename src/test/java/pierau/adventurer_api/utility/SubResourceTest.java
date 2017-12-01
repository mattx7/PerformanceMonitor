package pierau.adventurer_api.utility;

import org.testng.annotations.Test;
import pierau.adventurer_api.http.web_resource.MainResource;
import pierau.adventurer_api.http.web_resource.SubResource;

import static org.testng.AssertJUnit.assertEquals;

public class SubResourceTest {

    @Test
    public void test() throws Exception {
        // prepare objects
        SubResource subResource = SubResource.from(MainResource.QUESTS, "1", "deliveries");
        // check method to test
        String path = subResource.getPath();
        // post-conditions
        assertEquals(path, "/blackboard/quests/1/deliveries");
    }

}