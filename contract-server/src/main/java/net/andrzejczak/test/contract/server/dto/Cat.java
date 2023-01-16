package net.andrzejczak.test.contract.server.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Cat {
    String name;
    String color;
}
