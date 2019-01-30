package io.project.app.jdkdemo;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class MainController {

    @GetMapping
    public Flux<String> get() {

        log.info("TEST LOG");
        double result3 = Math.floorDiv(-100, 9);
        System.out.println("result3: " + result3);

        double result4 = -100 / 9;
        System.out.println("result4: " + result4);
        return Flux.just("List");
    }
}
