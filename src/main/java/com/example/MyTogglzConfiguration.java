package com.example;

import java.io.File;

import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.UserProvider;
import org.togglz.spring.security.SpringSecurityUserProvider;

public class MyTogglzConfiguration implements TogglzConfig
{

  public UserProvider getUserProvider()
  {
    return new SpringSecurityUserProvider("ADMIN");
  }

  @Override
  public Class<? extends Feature> getFeatureClass()
  {

    return MyFeatures.class;
  }

  @Override
  public StateRepository getStateRepository()
  {
    return new FileBasedStateRepository(new File("application.yml"));
  }

}
