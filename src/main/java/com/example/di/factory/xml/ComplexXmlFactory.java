package com.example.di.factory.xml;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.ComplexFactory;
import com.example.di.model.config.ComplexConfig;
import com.example.di.model.config.Config;
import com.example.di.model.props.XmlProps;
import com.example.di.model.worker.ComplexWorker;
import com.example.di.model.worker.Worker;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service("complex-xml")
@RequiredArgsConstructor
public class ComplexXmlFactory extends ComplexFactory<XmlProps> {

  private final ComplexConfig<XmlProps> config;

  private final ComplexWorker<XmlProps> worker;

  @Override
  public ConfigType getConfigType() {
    return ConfigType.COMPLEX_XML;
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
