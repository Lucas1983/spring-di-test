package com.example.di.model.config.xml;

import com.example.di.model.config.BasicConfig;
import com.example.di.model.props.XmlProps;
import org.springframework.stereotype.Component;

@Component
public class BasicXmlConfig extends BasicConfig<XmlProps> {

  @Override
  public XmlProps getProps() {
    return new XmlProps();
  }
}
