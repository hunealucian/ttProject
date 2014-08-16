package tabletenis.project.api.jndi;

import tabletenis.project.api.localconfig.DataSourceConfig;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
public class BootstrapConfig
{

    private final DataSourceConfig dataSourceConfig;
    private String runningMode;

    public BootstrapConfig() {
        dataSourceConfig = new DataSourceConfig();
    }

    public void setDBServerName(String serverName) {
        dataSourceConfig.setServer(serverName);
    }

    public void setDBServiceName(String serviceName) {
        dataSourceConfig.setDatabase(serviceName);
    }

    public void setDBSchemaName(String schemaName) {
        dataSourceConfig.setUser(schemaName);
    }

    public void setDBPassword(String password) {
        dataSourceConfig.setPassword(password);
    }

    public void setDBPort(Integer port) {
        dataSourceConfig.setPort(port);
    }

    public void setDBMinPoolSize(Integer minPoolSize) {
        dataSourceConfig.setMinPoolSize(minPoolSize);
    }

    public void setDBMaxPoolSize(Integer maxPoolSize) {
        dataSourceConfig.setMaxPoolSize(maxPoolSize);
    }

    public void setDBMaxIdleTime(Integer maxIdleTime) {
        dataSourceConfig.setMaxIdleTime(maxIdleTime);
    }

    public DataSourceConfig getDataSourceConfig() {
        return dataSourceConfig;
    }

    public void setRunningMode(String runningMode) {
        this.runningMode = runningMode;
    }

    public String getRunningMode() {
        return runningMode;
    }

    @Override
    public String toString() {
        return "com.spmsoftware.localconfig.jndi.BootstrapConfig:\n" +
                "\trunningMode: " + runningMode + '\n' +
                "\tDBServerName: " + dataSourceConfig.getServer() + '\n' +
                "\tDBServiceName: " + dataSourceConfig.getDatabase() + '\n' +
                "\tDBSchemaName: " + dataSourceConfig.getUser() + '\n' +
                "\tDBPort: " + dataSourceConfig.getPort() + '\n' +
                "\tDBMinPoolSize: " + dataSourceConfig.getMinPoolSize() + '\n' +
                "\tDBMaxPoolSize: " + dataSourceConfig.getMaxPoolSize() + '\n' +
                "\tDBMaxIdleTime: " + dataSourceConfig.getMaxIdleTime() + '\n';
    }
}
