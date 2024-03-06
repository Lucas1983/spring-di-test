package com.example.di.factory.json;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.BasicFactory;
import com.example.di.model.config.BasicConfig;
import com.example.di.model.config.Config;
import com.example.di.model.props.JsonProps;
import com.example.di.model.worker.BasicWorker;
import com.example.di.model.worker.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("basic-json")
@RequiredArgsConstructor
public class BasicJsonFactory extends BasicFactory<JsonProps> {

  private final BasicConfig<JsonProps> config;

  private final BasicWorker<JsonProps> worker;

  @Override
  public ConfigType getConfigType() {
    return ConfigType.BASIC_JSON;
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
