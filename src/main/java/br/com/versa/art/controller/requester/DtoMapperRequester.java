package br.com.versa.art.controller.requester;

import br.com.versa.art.domain.requester.ArtRequester;
import org.springframework.stereotype.Service;

@Service
public class DtoMapperRequester {

    public ArtRequester mapperRequester(ArtRequester artRequester, RequesterDTO dto){
        ArtRequester art = new ArtRequester();
        art.setIdConsumer(dto.getIdConsumer());
        art.setIdArtCreation(dto.getIdArtCreation());
        art.setDescribeNewCreation(dto.getDescribeNewCreation());
        art.setInspirationNewCreationImage(dto.getInspirationNewCreationImage());
        return art;
    }

}
