package br.com.versa.art.controller.requester;

import br.com.versa.art.domain.requester.ArtRequester;
import br.com.versa.art.domain.requester.ArtRequesterFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class ControllerRequester {

    private ArtRequesterFactory artRequesterFactory;
    private DtoMapperRequester mapperRequester;
    public ControllerRequester(ArtRequesterFactory artRequesterFactory,
                               DtoMapperRequester mapperRequester){
        this.artRequesterFactory = artRequesterFactory;
        this.mapperRequester = mapperRequester;
    }

    @RequestMapping(value = "/versa/art/requester", method = RequestMethod.POST)
    public ResponseEntity controllerRequester(@Valid @RequestBody RequesterDTO dto){
        ArtRequester artRequester = artRequesterFactory.createArtRequester();
        artRequester = mapperRequester.mapperRequester(artRequester, dto);
        artRequester.save();
        return new ResponseEntity(HttpStatus.OK);
    }
}
