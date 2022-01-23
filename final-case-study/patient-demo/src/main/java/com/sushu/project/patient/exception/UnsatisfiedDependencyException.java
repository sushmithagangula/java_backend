package com.sushu.project.patient.exception;

public class UnsatisfiedDependencyException extends RuntimeException{
    public UnsatisfiedDependencyException(String message) {
        super(message);
    }
}
