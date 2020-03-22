package br.com.versa.art.domain.version;

import java.util.UUID;

public interface CreateNewVersionPort {
    void create(UUID idArtCreation, VersionArtCreation versionArtCreation);
}
