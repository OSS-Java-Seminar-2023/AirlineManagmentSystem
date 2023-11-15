package hr.OSSAirline.repositories;

import hr.OSSAirline.models.Airplane;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AirplaneRepository extends JpaRepository<Airplane, UUID> {
}
