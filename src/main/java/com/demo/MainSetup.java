package com.demo;

import org.nutz.ioc.Ioc;
import org.nutz.mvc.NutConfig;
import org.nutz.mvc.Setup;


public class MainSetup implements Setup {

    public void init(NutConfig nutConfig) {
        Ioc ioc = nutConfig.getIoc();
    }

    public void destroy(NutConfig nutConfig) {

    }
}
