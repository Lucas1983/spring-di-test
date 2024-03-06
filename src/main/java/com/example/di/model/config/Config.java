package com.example.di.model.config;

import com.example.di.model.props.Props;

public interface Config<T extends Props> {

  T getProps();
}
