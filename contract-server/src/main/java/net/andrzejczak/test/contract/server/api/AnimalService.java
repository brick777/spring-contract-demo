package net.andrzejczak.test.contract.server.api;

import lombok.extern.slf4j.Slf4j;
import net.andrzejczak.test.contract.server.dto.Cat;
import net.andrzejczak.test.contract.server.dto.Dog;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AnimalService {

    Cat getCat(int id) {
        return createCat(id);
    }

    List<Cat> getCats() {
        List<Cat> catList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            catList.add(createCat(i));
        }
        return catList;
    }

    Dog getDog(int id) {
        return createDog(id);
    }

    List<Dog> getDogs() {
        List<Dog> dogList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dogList.add(createDog(i));
        }
        return dogList;
    }

    private Cat createCat(int id) {
        return Cat.builder().color("czarny_"+id).name("Fela_"+id).build();
    }

    private Dog createDog(int id) {
        return Dog.builder().owner("Mr_" + id).age(id).name("Platek_" + id).build();
    }
}
