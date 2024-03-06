package com.example.di.factory.json;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.ComplexFactory;
import com.example.di.model.config.ComplexConfig;
import com.example.di.model.config.Config;
import com.example.di.model.props.JsonProps;
import com.example.di.model.worker.ComplexWorker;
import com.example.di.model.worker.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("complex-json")
@RequiredArgsConstructor
public class ComplexJsonFactory extends ComplexFactory<JsonProps> {

  private final ComplexConfig<JsonProps> config;

  private final ComplexWorker<JsonProps> worker;

  @Override
  public ConfigType getConfigType() {
    return ConfigType.COMPLEX_JSON;
  }

  @Override
  public Config<JsonProps> getConfig() {
    return config;
  }

  @Override
  public Worker<JsonProps> getWorker() {
    return worker;
  }
}
