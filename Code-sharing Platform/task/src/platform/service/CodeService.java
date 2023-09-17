package platform.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import platform.Repository.CodeRepository;
import platform.model.Code;

@AllArgsConstructor
@Service
public class CodeService {
    private final CodeRepository codeRepository;

    public String getHtmlCode() {
        return codeRepository
                .getCode()
                .orElseThrow()
                .code();
    }

    public String getJsonCode() {
        return codeRepository.getCode()
                .orElse(new Code(""))
                .code().split("</?pre>")[1];
    }
}