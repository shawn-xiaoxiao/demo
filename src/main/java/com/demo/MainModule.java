package com.demo;

import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.SetupBy;


@Modules(scanPackage = true)
@SetupBy(value = MainSetup.class)
public class MainModule {
}
