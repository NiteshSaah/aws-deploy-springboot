package org.nitesh.awsdeployspringboot.dto;

public record HomeDetails(Long homeId, String homeName,boolean isBesideRoadSide, String location,long area) {
}
