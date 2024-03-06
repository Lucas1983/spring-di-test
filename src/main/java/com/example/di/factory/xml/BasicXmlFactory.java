package com.example.di.factory.xml;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.BasicFactory;
import com.example.di.model.config.BasicConfig;
import com.example.di.model.config.Config;
import com.example.di.model.props.XmlProps;
import com.example.di.model.worker.BasicWorker;
import com.example.di.model.worker.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("basic-xml")
@RequiredArgsConstructor
public class BasicXmlFactory extends BasicFactory<XmlProps> {

  private final BasicConfig<XmlProps> config;

  private final BasicWorker<XmlProps> worker;

  @Override
  public ConfigType getConfigType() {
    return ConfigType.BASIC_XML;
  }

  @Override
  public Config<XmlProps> getConfig() {
    return config;
  }

  @Override
  public Worker<XmlProps> getWorker() {
    return worker;
  }
}
