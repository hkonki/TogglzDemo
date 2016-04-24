package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MyFeatures;

@RestController
@RequestMapping("/TogglzService")
public class TogglzDemoController
{

  @RequestMapping("/features")
  public String getTotalFeatures()
  {
    String enabledFaetures = "";
    if (MyFeatures.FEATURE_ONE.isActive())
    {
      enabledFaetures = enabledFaetures + "Feature one enabled";
    }

    if (MyFeatures.FEATURE_TWO.isActive())
    {
      enabledFaetures = enabledFaetures + "\n" + "Feature two enabled";
    }
    return enabledFaetures;
  }
}
