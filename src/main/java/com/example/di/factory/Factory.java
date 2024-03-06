package com.example.di.factory;

import com.example.di.dictionary.ConfigType;
import com.example.di.model.config.Config;
import com.example.di.model.props.Props;
import com.example.di.model.worker.Worker;

public interface Factory<T extends Props> {

  ConfigType getConfigType();

  Config<T> getConfig();

  Worker<T> getWorker();
}
