package com.jsontest;

import java.util.List;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Data
@ToString
@RequiredArgsConstructor
public class Persona {
    Names name;
    String apellido;
    Integer edad;
    List<Integer> direccion;
}
