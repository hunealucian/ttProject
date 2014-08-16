package tabletenis.project.api;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
public enum RunningMode
{
    production,
    development,
    testing;

    public static RunningMode fromString(String value) {
        return valueOf(value.toLowerCase());
    }
}
