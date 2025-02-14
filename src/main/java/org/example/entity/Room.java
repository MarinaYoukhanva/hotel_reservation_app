package org.example.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.base.model.BaseEntity;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Room extends BaseEntity<Long> {

    @Column(nullable = false)
    private String roomNumber;

    @Column(nullable = false)
    private Long costPerNight;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private boolean isAvailable;

    @ManyToOne(optional = false)
    @JoinColumn(name = "hotel_id")
    private Hotel hotel;

    

}
