package br.com.versa.art.domain.version;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class VersionArtCreation {

    private int versionArt;
    private MultipartFile artCreated;
    private String feedbackArtCreated;
    private boolean aproveArtCreated;

    private CreateNewVersionPort createNewVersionPort;
    private UpdateVersionPort updateVersionPort;
    private QueryVersionPort queryVersionPort;
    public VersionArtCreation(CreateNewVersionPort createNewVersionPort, UpdateVersionPort updateVersionPort,
                              QueryVersionPort queryVersionPort){
        this.createNewVersionPort = createNewVersionPort;
        this.updateVersionPort = updateVersionPort;
        this.queryVersionPort = queryVersionPort;
    }

    public void create(UUID idArtCreation){
        versionArt++;
        createNewVersionPort.create(idArtCreation, this);
    }

    public void update(){
        updateVersionPort.update(this);
    }

    public List<VersionArtCreation> query(UUID idArtCreation){
        return queryVersionPort.query(idArtCreation);
    }

}
