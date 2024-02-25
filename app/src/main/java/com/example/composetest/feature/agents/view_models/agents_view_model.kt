import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.navigation.NavController
import com.example.composetest.data.api.agents.AgentsItemModel
import com.example.composetest.data.api.agents.AgentsModel
import com.example.composetest.data.api.agents.nullAgentItemModel
import com.example.composetest.presentations.utils.Screen
import kotlinx.coroutines.delay
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AgentsViewModel: ViewModel() {
    val agentList = MutableLiveData<List<AgentsItemModel>>()
    var isLoading: Boolean by mutableStateOf(false)
    var selectedAgent by mutableStateOf(nullAgentItemModel)


    fun fetchAgents() {
        val call = RetrofitClientAgent.instance.getAgents()
        try {
            call.enqueue(object : Callback<AgentsModel> {
                override  fun onResponse(call: Call<AgentsModel>, response: Response<AgentsModel>) {
                    if (response.isSuccessful) {
                        val agents = response.body()
                        if (agents != null) {
                            agentList.value = agents.data
                            isLoading = true
                            filterAgents()
                        }
                    }
                }
                override fun onFailure(call: Call<AgentsModel>, t: Throwable) {
                    Log.e("Error", t.message.toString())
                }
            })
        } catch (e: Exception) {
            Log.e("Error", e.message.toString())
        }
    }


    private fun filterAgents() {
        val currentList = agentList.value.orEmpty()
        val filteredList = currentList.filter { agent ->
            !agent.bustPortrait.isNullOrBlank() && !agent.bustPortrait.isNullOrBlank()}
            agentList.value = filteredList
    }


    fun selectAgent(agent: AgentsItemModel, navController: NavController) {
        selectedAgent = agent
        navController.currentBackStackEntry?.savedStateHandle?.set("AgentsItemModel", selectedAgent)
        navController.navigate(Screen.AgentDetailScreen.route)
    }
}
