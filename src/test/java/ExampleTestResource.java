import java.util.Map;

import org.eclipse.microprofile.config.ConfigProvider;

import io.quarkus.test.common.DevServicesContext;
import io.quarkus.test.common.QuarkusTestResourceLifecycleManager;
import io.smallrye.config.SmallRyeConfig;

public class ExampleTestResource implements QuarkusTestResourceLifecycleManager {

    @Override
    public Map<String, String> start() {
        System.out.println("##########################\n@QuarkusTestResourceLifecycleManager config profiles: " + ((SmallRyeConfig) ConfigProvider.getConfig()).getProfiles() + "\n##########################");
        return null;
    }

    @Override
    public void stop() {
    }

}
