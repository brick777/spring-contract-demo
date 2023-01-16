package net.andrzejczak.test.contract.server.api;

import lombok.RequiredArgsConstructor;
import net.andrzejczak.test.contract.server.dto.Cat;
import net.andrzejczak.test.contract.server.dto.Dog;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping(value = "/v1/cats/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Cat getCat(@PathVariable("id") int id) {
        return animalService.getCat(id);
    }

    @GetMapping(value = "/v1/cats", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Cat> getCatList() {
        return animalService.getCats();
    }

    @GetMapping(value = "/v1/dogs/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Dog getDog(@PathVariable("id") int id) {
        return animalService.getDog(id);
    }

    @GetMapping(value = "/v1/dogs", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dog> getDogList() {
        return animalService.getDogs();
    }
}
