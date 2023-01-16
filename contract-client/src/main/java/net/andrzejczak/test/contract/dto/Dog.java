package net.andrzejczak.test.contract.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@Data
@NoArgsConstructor
public class Dog {
    String name;
    int age;
    String owner;
}
