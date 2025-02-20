package net.javaguides.springboot.WebRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.javaguides.springboot.dto.NatureOfTheDayDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class NatureOfTheDayResponse {
    private List<NatureOfTheDayDto>natureOfTheDayDtos;
    private long totalCount;
}
