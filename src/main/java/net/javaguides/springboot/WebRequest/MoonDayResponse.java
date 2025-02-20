package net.javaguides.springboot.WebRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import net.javaguides.springboot.dto.MoonDayDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class MoonDayResponse {
    private List<MoonDayDto> moonDayDtos;
    private Long totalCount;
}
