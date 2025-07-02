package com.codeit.otboo.domain.clothes.dto.response;

import java.util.List;
import java.util.UUID;

public record ClothesAttributeDefDto(
	UUID id,
	String name,
	List<String> selectableValues
) {
}
