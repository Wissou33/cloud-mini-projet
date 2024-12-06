package cloud.miniprojet;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom; //
    private String prenom;
    private Integer age;
    @ManyToOne
    @JoinColumn(name = "id_region")
    private Region region;
}
