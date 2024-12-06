package org.openapitools.configuration;

import zut.pba.models.Nationality;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;

@Configuration
public class EnumConverterConfiguration {

    @Bean(name = "org.openapitools.configuration.EnumConverterConfiguration.nationalityConverter")
    Converter<String, Nationality> nationalityConverter() {
        return new Converter<String, Nationality>() {
            @Override
            public Nationality convert(String source) {
                return Nationality.fromValue(source);
            }
        };
    }

}
