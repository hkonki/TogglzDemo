package com.example;

import java.io.File;

import org.springframework.context.annotation.Configuration;
import org.togglz.core.Feature;
import org.togglz.core.manager.TogglzConfig;
import org.togglz.core.repository.StateRepository;
import org.togglz.core.repository.file.FileBasedStateRepository;
import org.togglz.core.user.NoOpUserProvider;
import org.togglz.core.user.UserProvider;



@Configuration
public class MyTogglzConfiguration implements TogglzConfig
{

  @Override
  public Class<? extends Feature> getFeatureClass()
  {
    return MyFeatures.class;
  }

  @Override
  public StateRepository getStateRepository()
  {
    return new FileBasedStateRepository(new File("src/main/resources/application.properties"));
  }

  @Override
  public UserProvider getUserProvider()
  {
    return new NoOpUserProvider();
  }

}
