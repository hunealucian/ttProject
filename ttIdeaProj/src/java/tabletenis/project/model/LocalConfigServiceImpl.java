package tabletenis.project.model;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import tabletenis.project.api.LocalConfigService;
import tabletenis.project.api.RunningMode;
import tabletenis.project.api.jndi.BootstrapConfig;
import tabletenis.project.api.localconfig.DataSourceConfig;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
public class LocalConfigServiceImpl implements LocalConfigService
{
    private static final Logger logger = LoggerFactory.getLogger(LocalConfigServiceImpl.class.getName());

    private BootstrapConfig bootstrapConfig;
    private final ConcurrentHashMap<String, Object> properties = new ConcurrentHashMap<>();

    public void loadConfiguration() {
        bootstrapConfig = getBootstrapFromJNDI();
        properties.clear();
    }

    private static BootstrapConfig getBootstrapFromJNDI() {
        BootstrapConfig bootstrapConfig = (BootstrapConfig) lookUpAndLogValue(RUNNING_MODE_CONFIG);
        if (bootstrapConfig == null) {
            logger.warn("BootstrapConfig is null");
        }
        return bootstrapConfig;
    }

    @Override
    public RunningMode getRunningMode()
    {
        return RunningMode.fromString(bootstrapConfig.getRunningMode());
    }

    @Override
    public DataSourceConfig getCentralDataSource()
    {
        return bootstrapConfig.getDataSourceConfig();
    }

    private static Object lookUpAndLogValue(String propertyName) {
        Object value = lookUp(propertyName);
        logger.info("\nJNDI Lookup for 'com/spmsoftware/{}' returned: {}", propertyName, value);
        return value;
    }

    private static Object lookUp(String propertyName) {
        try {
            return new InitialContext().lookup("com/spmsoftware/" + propertyName);
        } catch (NamingException e) {
            return null;
        }
    }
}
