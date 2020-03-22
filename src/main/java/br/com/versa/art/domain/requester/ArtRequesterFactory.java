package br.com.versa.art.domain.requester;

import br.com.versa.art.domain.version.CreateNewVersionPort;
import br.com.versa.art.domain.version.QueryVersionPort;
import br.com.versa.art.domain.version.UpdateVersionPort;
import org.springframework.stereotype.Service;

@Service
public class ArtRequesterFactory {

    private CreateRequesterNewArtPort createRequesterNewArtPort;
    private QueryArtRequesterPort queryArtRequesterPort;
    private CreateNewVersionPort createNewVersionPort;
    private UpdateVersionPort updateVersionPort;
    private QueryVersionPort queryVersionPort;
    public  ArtRequesterFactory(CreateRequesterNewArtPort createRequesterNewArtPort,
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

    public ArtRequester createArtRequester(){
        return new ArtRequester(createRequesterNewArtPort,
                                queryArtRequesterPort,
                                createNewVersionPort,
                                updateVersionPort,
                                queryVersionPort);
    }
}
