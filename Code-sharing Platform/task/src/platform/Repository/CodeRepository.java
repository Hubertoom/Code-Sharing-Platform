package platform.Repository;

import org.springframework.stereotype.Repository;
import platform.model.Code;

import java.util.Optional;

@Repository
public interface CodeRepository {
    Optional<Code> getCode();
}