package br.com.versa.art.controller.designer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ControllerDesigner {

    private DtoMapperDesigner mapperDesigner;

    public ControllerDesigner(DtoMapperDesigner mapperDesigner){
        this.mapperDesigner = mapperDesigner;
    }

    @RequestMapping(value = "/versa/art/designer", method = RequestMethod.POST)
    public ResponseEntity createBusiness(@Valid @RequestBody DesignerDTO designerDTO){

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
