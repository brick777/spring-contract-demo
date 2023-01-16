package net.andrzejczak.test.contract.dto;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class Cat {
    String name;
    String color;
}
