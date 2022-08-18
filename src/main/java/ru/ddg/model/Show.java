package ru.ddg.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Show {
    private final String title;
    private final Integer releaseYear;
}
