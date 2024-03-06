package com.example.di.model.worker;

import com.example.di.model.props.Props;
import java.util.stream.Stream;

public interface Worker<T extends Props> {

  Stream<T> extract(Stream<T> stream);

  Stream<T> transform(Stream<T> stream);

  Stream<T> load(Stream<T> stream);
}
