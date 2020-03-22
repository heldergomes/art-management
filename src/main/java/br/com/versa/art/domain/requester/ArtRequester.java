package br.com.versa.art.domain.requester;

import br.com.versa.art.domain.version.CreateNewVersionPort;
import br.com.versa.art.domain.version.QueryVersionPort;
import br.com.versa.art.domain.version.UpdateVersionPort;
import br.com.versa.art.domain.version.VersionArtCreation;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class ArtRequester {

    private UUID idConsumer;
    private UUID idArtCreation;
    private String describeNewCreation;
    private List<MultipartFile> inspirationNewCreationImage;
    private List<VersionArtCreation> versionArtCreation;

    private CreateRequesterNewArtPort createRequesterNewArtPort;
    private QueryArtRequesterPort queryArtRequesterPort;
    private CreateNewVersionPort createNewVersionPort;
    private UpdateVersionPort updateVersionPort;
    private QueryVersionPort queryVersionPort;
    public  ArtRequester(CreateRequesterNewArtPort createRequesterNewArtPort,
                         QueryArtRequesterPort queryArtRequesterPort,
                         CreateNewVersionPort createNewVersionPort,
                         UpdateVersionPort updateVersionPort,
                         QueryVersionPort queryVersionPort){
        this.createRequesterNewArtPort = createRequesterNewArtPort;
        this.queryArtRequesterPort = queryArtRequesterPort;
        this.createNewVersionPort = createNewVersionPort;
        this.updateVersionPort = updateVersionPort;
        this.queryVersionPort = queryVersionPort;
    }

    public void save(){
        createRequesterNewArtPort.create(this);
    }

    public ArtRequester query(UUID idConsumer, UUID idArtCreation){
        return queryArtRequesterPort.query(idConsumer, idArtCreation, this);
    }

    public ArtRequester queryCompleteArtRequester(UUID idConsumer, UUID idArtCreation){
        ArtRequester artRequester = query(idConsumer, idArtCreation);
        VersionArtCreation version = createVersionFactory();
        this.versionArtCreation = version.query(this.idArtCreation);
        return artRequester;
    }

    public VersionArtCreation createVersionFactory(){
        return new VersionArtCreation(createNewVersionPort,updateVersionPort, queryVersionPort);

    }
}
