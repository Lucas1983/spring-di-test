package com.example.di.model.worker.xml;

import com.example.di.model.props.XmlProps;
import com.example.di.model.worker.BasicWorker;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;

@Component
public class BasicXmlWorker extends BasicWorker<XmlProps> {

  @Override
  public Stream<XmlProps> extract(Stream<XmlProps> stream) {
    return null;
  }

  @Override
  public Stream<XmlProps> transform(Stream<XmlProps> stream) {
    return null;
  }

  @Override
  public Stream<XmlProps> load(Stream<XmlProps> stream) {
    return null;
  }
}
