package valdez.joel.parcial.facitec.edu.py.op2final;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Usuario on 12/10/2016.
 */
public interface BatmanService {
    @GET("/?s=batman")
    void obtenerBatman(Callback<Resultado> resultado);
}
