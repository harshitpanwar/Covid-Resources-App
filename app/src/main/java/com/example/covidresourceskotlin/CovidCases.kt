package com.example.covidresourceskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_covid_cases.*
import kotlinx.android.synthetic.main.activity_splash_screen.*
import org.json.JSONArray
import org.json.JSONException

class CovidCases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_covid_cases)



        //parsing the json data here

        jsonParse()




    }



    private fun jsonParse() {
        val queue = Volley.newRequestQueue(this);
        val url = "https://api.rootnet.in/covid19-in/stats/latest"
        val request = JsonObjectRequest(Request.Method.GET, url, null, {
                response ->try {
                    val objData = response.getJSONObject("data")
            val objArray = objData.getJSONArray("unofficial-summary")
            val unofficial_summary_array = objArray.getJSONObject(0)
            val total = unofficial_summary_array.getString("total")
            val totalCases = unofficial_summary_array.getString("total")
            val recovered = unofficial_summary_array.getString("recovered")
            val activeCases = unofficial_summary_array.getString("active")
            val totalDeaths = unofficial_summary_array.getString("deaths")
            val objSummary = objData.getJSONObject("summary")

            total_cases.text = total
            recover.text = recovered
            active .text = activeCases
            deaths.text = totalDeaths


//            for (i in 0 until jsonArray.length()) {
//                val employee = jsonArray.getJSONObject(i)
//                val firstName = employee.getString("firstname")
//                val age = employee.getInt("age")
//                val mail = employee.getString("mail")
//                textView.append("$firstName, $age, $mail\n\n")
//            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
        }, { error -> error.printStackTrace() })
        queue?.add(request)
    }



}