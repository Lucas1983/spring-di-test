package com.example.di.model.config.xml;

import com.example.di.model.config.ComplexConfig;
import com.example.di.model.props.XmlProps;
import org.springframework.stereotype.Component;

@Component
public class ComplexXmlConfig extends ComplexConfig<XmlProps> {

  @Override
  public XmlProps getProps() {
    return new XmlProps();
  }
}
