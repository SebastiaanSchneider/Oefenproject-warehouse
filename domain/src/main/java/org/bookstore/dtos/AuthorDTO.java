package org.bookstore.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    @NotNull
    private long id;

    @NotNull
    private String firstName;

    private String middleName;

    @NotNull
    private String lastName;

    private LocalDate birthDate;

    private List<BookDTO> books = new ArrayList<>();
}
