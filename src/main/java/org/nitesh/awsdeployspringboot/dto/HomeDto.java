package org.nitesh.awsdeployspringboot.dto;

public record HomeDto(long homeId,  Boolean isAvailable,long price,HomeDetails homeDetails) {
}
