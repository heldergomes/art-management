package br.com.versa.art.controller;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ResponseErrorDTO {

    private String returnCode;
    private String message;

}
