package br.com.versa.art.domain.requester;

import java.util.UUID;

public interface QueryArtRequesterPort {
    ArtRequester query(UUID idConsumer, UUID idArtCreation, ArtRequester artRequester);
}
