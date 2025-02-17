package org.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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


    public String toString() {
        return "Room(" +
                "id=" + getId() +
                ", roomNumber=" + this.getRoomNumber() +
                ", costPerNight=" + this.getCostPerNight() +
                ", capacity=" + this.getCapacity() + ", isAvailable=" + this.isAvailable() +
                ", hotel=" + this.getHotel() + ")";
    }
}
