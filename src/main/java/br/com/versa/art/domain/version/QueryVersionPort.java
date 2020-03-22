package br.com.versa.art.domain.version;

import java.util.List;
import java.util.UUID;

public interface QueryVersionPort {
    List<VersionArtCreation> query(UUID idArtCreation);
}
