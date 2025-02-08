package com.devmarrima.gestorstock.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
 public List<FieldMessage> erros = new ArrayList<>();

    public ValidationError(Instant timeStamp, Integer status, String error, String path) {
        super(timeStamp, status, error, path);
    }

    public void addError(String fieldName, String massege){
        erros.add(new FieldMessage(fieldName, massege));
    }
}
