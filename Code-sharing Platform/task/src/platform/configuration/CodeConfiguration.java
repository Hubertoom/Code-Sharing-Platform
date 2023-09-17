package platform.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import platform.model.Code;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class CodeConfiguration {

    @Bean
    public List<Code> getTemplate() {
        return new ArrayList<>(List.of(new Code(
                """
                                <html>
                                <head>
                                    <title>Code</title>
                                </head>
                                <body>
                                    <pre>
                                public static void main(String[] args) {
                                    SpringApplication.run(CodeSharingPlatform.class, args);
                                }</pre>
                                </body>
                                </html>
                        """))
        );
    }
}
