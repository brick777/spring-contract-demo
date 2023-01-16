package net.andrzejczak.test.contract.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.andrzejczak.test.contract.dto.Cat;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AnimalService {
    private final AnimalClient animalClient;

    public Cat findCat(int id) {
        Cat cat = animalClient.getCat(id);

        log.info(cat.getColor() + " " + cat.getName());

        return cat;
    }
}
