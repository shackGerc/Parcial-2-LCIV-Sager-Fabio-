package ar.edu.utn.frc.tup.lc.iv.dtos.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CargosDeDistrito {
    private Distrito distrito;
    private List<Cargo> cargos;
}
