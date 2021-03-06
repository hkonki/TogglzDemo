package com.example;

import org.springframework.context.annotation.Bean;
import org.togglz.core.Feature;
import org.togglz.core.annotation.EnabledByDefault;
import org.togglz.core.annotation.Label;
import org.togglz.core.context.FeatureContext;
import org.togglz.core.manager.EnumBasedFeatureProvider;
import org.togglz.core.spi.FeatureProvider;

public enum MyFeatures implements Feature
{

  @EnabledByDefault
  @Label("First Feature")
  FEATURE_ONE,
  
  @Label("Second Feature")
  FEATURE_TWO;
  
  public boolean isActive() {
      return FeatureContext.getFeatureManager().isActive(this);
  }

}

