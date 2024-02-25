import com.example.composetest.data.api.agents.AgentsModel
import com.example.composetest.data.api.agents.ApiModelConstantAgents.BASE_URL_AGENTS
import com.example.composetest.data.api.agents.ApiModelConstantAgents.END_POINTS_AGENTS
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitClientAgent {
        val instance: ValorantServiceAgent by lazy {
            val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL_AGENTS)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(ValorantServiceAgent::class.java)
        }
}


interface ValorantServiceAgent {
    @GET(END_POINTS_AGENTS)
     fun getAgents(): Call<AgentsModel>
}

