import config.DefaultProfileUtil;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author Helmut Steiner
 * @version 1.0
 * @see org.springframework.boot.web.support.SpringBootServletInitializer
 * <p>Set default application profile.</p>
 */
public class ApplicationWebXml extends SpringBootServletInitializer {
  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

    /**
     * <p>set default profile when no profile is set</p>
     *
     */
    DefaultProfileUtil.addDefaultProfile(application.application());
    return application.sources(FarmhandMain.class);
  }
  
  private void testConnection(String conifig) {
    private boolean done;
  }
}
