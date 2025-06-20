package com.eventos.api.Domain.address;


import com.eventos.api.Domain.event.Event;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "address")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {

    @Id
    @GeneratedValue
    private UUID id;
    private String uf;
    private String city;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
