package com.example.di;

import static org.assertj.core.api.Assertions.*;

import com.example.di.dictionary.ConfigType;
import com.example.di.factory.Factory;
import com.example.di.model.config.json.BasicJsonConfig;
import com.example.di.model.config.json.ComplexJsonConfig;
import com.example.di.model.config.xml.BasicXmlConfig;
import com.example.di.model.config.xml.ComplexXmlConfig;
import com.example.di.model.props.Props;
import com.example.di.model.worker.json.BasicJsonWorker;
import com.example.di.model.worker.json.ComplexJsonWorker;
import com.example.di.model.worker.xml.BasicXmlWorker;
import com.example.di.model.worker.xml.ComplexXmlWorker;
import java.util.Map;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DependencyInjectionTestApplicationTests {

  @Autowired private Map<ConfigType, Factory<? extends Props>> config;

  @Test
  void test() {

    var basicXmlFactory = config.get(ConfigType.BASIC_XML);
    var basicXmlConfig = basicXmlFactory.getConfig();
    var basicXmlWorker = basicXmlFactory.getWorker();

    assertThat(basicXmlConfig).isInstanceOf(BasicXmlConfig.class);
    assertThat(basicXmlWorker).isInstanceOf(BasicXmlWorker.class);

    var complexXmlfactory = config.get(ConfigType.COMPLEX_XML);
    var complexXmlConfig = complexXmlfactory.getConfig();
    var complexXmlWorker = complexXmlfactory.getWorker();

    assertThat(complexXmlConfig).isInstanceOf(ComplexXmlConfig.class);
    assertThat(complexXmlWorker).isInstanceOf(ComplexXmlWorker.class);

    var basicJsonFactory = config.get(ConfigType.BASIC_JSON);
    var basicJsonConfig = basicJsonFactory.getConfig();
    var basicJsonWorker = basicJsonFactory.getWorker();

    assertThat(basicJsonConfig).isInstanceOf(BasicJsonConfig.class);
    assertThat(basicJsonWorker).isInstanceOf(BasicJsonWorker.class);

    var complexJsonFactory = config.get(ConfigType.COMPLEX_JSON);
    var complexJsonConfig = complexJsonFactory.getConfig();
    var complexJsonWorker = complexJsonFactory.getWorker();

    assertThat(complexJsonConfig).isInstanceOf(ComplexJsonConfig.class);
    assertThat(complexJsonWorker).isInstanceOf(ComplexJsonWorker.class);
  }
}
