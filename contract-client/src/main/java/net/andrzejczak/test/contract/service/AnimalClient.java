package net.andrzejczak.test.contract.service;

import net.andrzejczak.test.contract.dto.Cat;
import net.andrzejczak.test.contract.dto.Dog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import java.util.List;

@FeignClient(value = "animalClient", url = "http://localhost:8080/v1")
interface AnimalClient {
    @RequestMapping(method = RequestMethod.GET, value = "/cats/{id}")
    Cat getCat(@PathVariable("id")  int id);

    @RequestMapping(method = RequestMethod.GET, value = "/cats")
    List<Cat> getCats();

    @RequestMapping(method = RequestMethod.GET, value = "/dogs/{id}")
    Dog getDog(@PathVariable("id")  int id);

    @RequestMapping(method = RequestMethod.GET, value = "/dogs")
    List<Dog> getDogs();
}
