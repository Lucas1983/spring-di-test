package com.example.di.config;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.Factory;
import com.example.di.model.props.Props;
import java.util.Map;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class AppConfiguration {

  private final Map<String, Factory<? extends Props>> factories;

  @Bean
  Map<ConfigType, Factory<? extends Props>> config() {
    return factories.entrySet().stream()
        .map(
            factoryEntry ->
                Map.entry(ConfigType.from(factoryEntry.getKey()), factoryEntry.getValue()))
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
  }
}
