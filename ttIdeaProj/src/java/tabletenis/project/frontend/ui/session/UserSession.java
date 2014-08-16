package tabletenis.project.frontend.ui.session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import tabletenis.project.frontend.Scopes;

/**
 * Description:
 *
 * @author Hunea Paul Lucian (hunea@optymyze.com)
 */
@Component
@Scope(Scopes.Session)
public class UserSession
{
    private static final Logger logger = LoggerFactory.getLogger(UserSession.class);
}
