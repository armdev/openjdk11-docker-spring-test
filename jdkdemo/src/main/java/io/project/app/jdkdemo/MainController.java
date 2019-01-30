package io.project.app.jdkdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 *
 * @author armena
 */
@RestController
@RequestMapping("/api/v2/data")
public class MainController {

    @GetMapping
    public Flux<String> get() {
        return Flux.just("List");
    }
}
