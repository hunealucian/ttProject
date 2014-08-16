package tabletenis.project.api;

import tabletenis.project.api.localconfig.DataSourceConfig;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
public interface LocalConfigService
{
    String RUNNING_MODE_CONFIG = "bootstrap";

    RunningMode getRunningMode();

    DataSourceConfig getCentralDataSource();
}
