package platform.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import platform.model.Code;
import platform.service.CodeService;

@AllArgsConstructor
@RestController
public class Controller {

    private CodeService codeService;

    @GetMapping("code")
    public ResponseEntity<String> getHtmlCode() {
        return ResponseEntity
                .ok(codeService.getHtmlCode());
    }

    @GetMapping("/api/code")
    public ResponseEntity<Code> getJsonCode() {
        return ResponseEntity
                .ok(codeService.getJsonCode());
    }
}
