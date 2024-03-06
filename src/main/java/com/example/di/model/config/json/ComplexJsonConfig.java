package com.example.di.model.config.json;

import com.example.di.model.config.ComplexConfig;
import com.example.di.model.props.JsonProps;
import org.springframework.stereotype.Component;

@Component
public class ComplexJsonConfig extends ComplexConfig<JsonProps> {

  @Override
  public JsonProps getProps() {
    return new JsonProps();
  }
}
