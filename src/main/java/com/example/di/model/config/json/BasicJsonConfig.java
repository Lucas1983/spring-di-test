package com.example.di.model.config.json;

import com.example.di.model.config.BasicConfig;
import com.example.di.model.props.JsonProps;
import org.springframework.stereotype.Component;

@Component
public class BasicJsonConfig extends BasicConfig<JsonProps> {

  @Override
  public JsonProps getProps() {
    return new JsonProps();
  }
}
