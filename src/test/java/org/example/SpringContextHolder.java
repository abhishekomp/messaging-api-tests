package org.example;

import org.aom.AppConfig;
// the above import is for the main application configuration class coming from the dependency messaging-api
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Singleton-ish, but not thread-safe for parallel; for simple use.
 */
public class SpringContextHolder {
    private static ApplicationContext context;

    public static ApplicationContext getContext() {
        if (context == null) {
            System.out.println("[SpringContextHolder] Initializing Spring ApplicationContext");
            context = new AnnotationConfigApplicationContext(AppConfig.class);
        } else {
            System.out.println("[SpringContextHolder] Returning existing ApplicationContext");
        }
        return context;
    }

    // Optionally, add shutdown logic (not usually needed in tests)
    public static void closeContext() {
        if (context instanceof AnnotationConfigApplicationContext aac) {
            System.out.println("[SpringContextHolder] Closing Spring ApplicationContext");
            aac.close();
            context = null;
        } else {
            System.out.println("[SpringContextHolder] No ApplicationContext to close");
        }
    }
}