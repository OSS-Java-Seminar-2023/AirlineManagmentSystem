package hr.OSSAirline.models;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Entity(name = "purchase")
public class Purchase {
    @Id
    @UuidGenerator
    private String id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "purchase", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Ticket> tickets = new ArrayList<>();

    @Column
    private String paymentInfo;

    @Column
    private Date paymentDate;
}
