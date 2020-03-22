package br.com.versa.art.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

public class MapperConfig {

    public static ModelMapper generate(){
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        return mapper;
    }
}
