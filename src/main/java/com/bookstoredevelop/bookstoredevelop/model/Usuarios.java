package com.bookstoredevelop.bookstoredevelop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.apache.logging.log4j.message.Message;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @NotNull(message = "El numero de documento es obligatorio")
    private Integer documento;

    @NotBlank(message = "El nombre es obligatorio")
    private String nombre;

    @NotBlank(message = "El apellido es obligatorio")
    private String apellido;

    @NotBlank(message = "El username es obligatorio")
    private String username;

    @NotBlank(message = "El email es obligatorio")
    private String email;

    @NotBlank(message = "El cellular es obligatorio")
    private String cellular;

    private  Long rol;

    @NotBlank(message = "El password es obligatorio")
    private String Ppassword;
}
