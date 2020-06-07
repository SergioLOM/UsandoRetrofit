package co.edu.usandoretrofit.cliente;

import java.util.List;

import co.edu.usandoretrofit.entidad.Estudiante;
import co.edu.usandoretrofit.util.Parametro;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ClienteEstudiante {
    @GET(Parametro.ENDPOINT_LISTADO_ESTDIANTES)
    Call<List<Estudiante>> obtenerEstudiantes();
}
