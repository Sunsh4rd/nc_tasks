package spring.mvc.web.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import spring.mvc.root.RootApplicationContext;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{RootApplicationContext.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebApplicationContext.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}