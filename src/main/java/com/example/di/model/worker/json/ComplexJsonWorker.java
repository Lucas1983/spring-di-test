package com.example.di.model.worker.json;

import com.example.di.model.props.JsonProps;
import com.example.di.model.worker.ComplexWorker;
import java.util.stream.Stream;
import org.springframework.stereotype.Component;

@Component
public class ComplexJsonWorker extends ComplexWorker<JsonProps> {

  @Override
  public Stream<JsonProps> extract(Stream<JsonProps> stream) {
    return null;
  }

  @Override
  public Stream<JsonProps> transform(Stream<JsonProps> stream) {
    return null;
  }

  @Override
  public Stream<JsonProps> load(Stream<JsonProps> stream) {
    return null;
  }
}
