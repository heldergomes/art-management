package br.com.versa.art.controller.requester;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class RequesterDTO {

    private UUID idConsumer;
    private UUID idArtCreation;
    private String describeNewCreation;
    private List<MultipartFile> inspirationNewCreationImage;

}
