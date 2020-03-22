package br.com.versa.art.database.version;

import br.com.versa.art.domain.version.CreateNewVersionPort;
import br.com.versa.art.domain.version.QueryVersionPort;
import br.com.versa.art.domain.version.UpdateVersionPort;
import br.com.versa.art.domain.version.VersionArtCreation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class VersionDAO implements CreateNewVersionPort, UpdateVersionPort, QueryVersionPort {

    @Override
    public void create(UUID idArtCreation, VersionArtCreation versionArtCreation) {

    }

    @Override
    public void update(VersionArtCreation versionArtCreation) {

    }

    @Override
    public List<VersionArtCreation> query(UUID idArtCreation) {
        return null;
    }

}
