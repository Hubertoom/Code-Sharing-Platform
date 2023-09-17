package platform.Repository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import platform.model.Code;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Component
public class CodeRepositoryImpl implements CodeRepository {
    private final List<Code> codeList;

    @Override
    public Optional<Code> getCode() {
        return Optional.of(codeList.get(0));
    }
}