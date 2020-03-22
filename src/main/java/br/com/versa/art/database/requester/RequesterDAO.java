package br.com.versa.art.database.requester;

import br.com.versa.art.domain.requester.ArtRequester;
import br.com.versa.art.domain.requester.CreateRequesterNewArtPort;
import br.com.versa.art.domain.requester.QueryArtRequesterPort;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RequesterDAO implements CreateRequesterNewArtPort, QueryArtRequesterPort {

    @Override
    public void create(ArtRequester artRequester) {

    }

    @Override
    public ArtRequester query(UUID idConsumer, UUID idArtCreation, ArtRequester artRequester) {
        return null;
    }
}
