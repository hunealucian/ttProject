package tabletenis.project.api.localconfig;

import java.io.Serializable;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
public class DataSourceConfig implements Serializable
{

    private String user;
    private String password;
    private DatabaseConfig databaseConfig; //todo remove the unnecessary getter setters
    private String nlsComp; //specifies collation behavior of the database session
    private String nlsSort; //specifies collating sequence for order by queries
    private String initSql;

    public DataSourceConfig() {
        databaseConfig = new DatabaseConfig();
    }

    public String getServer() {
        return databaseConfig.getServer();
    }

    public void setServer(String server) {
        databaseConfig.setServer(server);
    }

    public Integer getPort() {
        return databaseConfig.getPort();
    }

    public void setPort(Integer port) {
        databaseConfig.setPort(port);
    }

    public String getInitSql() {
        return initSql;
    }

    public void setInitSql(String initSql) {
        this.initSql = initSql;
    }

    /**
     * Returns the service name
     */
    public String getDatabase() {
        return databaseConfig.getDatabase();
    }

    /**
     * Sets the service name
     *
     * @param database service name
     */
    public void setDatabase(String database) {
        databaseConfig.setDatabase(database);
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMinPoolSize() {
        return databaseConfig.getMinPoolSize();
    }

    public void setMinPoolSize(int minPoolSize) {
        databaseConfig.setMinPoolSize(minPoolSize);
    }

    public int getMaxPoolSize() {
        return databaseConfig.getMaxPoolSize();
    }

    public void setMaxPoolSize(int maxPoolSize) {
        databaseConfig.setMaxPoolSize(maxPoolSize);
    }

    public int getMaxIdleTime() {
        return databaseConfig.getMaxIdleTime();
    }

    public void setMaxIdleTime(int maxIdleTime) {
        databaseConfig.setMaxIdleTime(maxIdleTime);
    }

    public DatabaseConfig getDatabaseConfig() {
        return databaseConfig;
    }

    public void setDatabaseConfig(DatabaseConfig databaseConfig) {
        this.databaseConfig = databaseConfig;
    }

    public String getNlsSort() {
        return nlsSort;
    }

    public void setNlsSort(String nlsSort) {
        this.nlsSort = nlsSort;
    }

    public String getNlsComp() {
        return nlsComp;
    }

    public void setNlsComp(String nlsComp) {
        this.nlsComp = nlsComp;
    }


    @Override
    public String toString() {
        return "DataSourceConfig{" +
                "server='" + databaseConfig.getServer() + '\'' +
                ", port='" + databaseConfig.getPort() + '\'' +
                ", database='" + databaseConfig.getDatabase() + '\'' +
                ", user='" + user + '\'' +
                ", minPoolSize='" + databaseConfig.getMinPoolSize() + '\'' +
                ", maxPoolSize='" + databaseConfig.getMaxPoolSize() + '\'' +
                ", maxIdleTime='" + databaseConfig.getMaxIdleTime() + '\'' +
                ", nls_comp='" + nlsComp + '\'' +
                ", nls_sort='" + nlsSort + '\'' +
                '}';
    }
}
