package com.pucp.diegocampos.firebasepruebas.request

import org.json.JSONArray
import org.json.JSONObject

/**
 * Created by diegocamposaquino on 1/10/17.
 */
interface ServiceInterface {
    fun getJSONArray(path:String,completionHandler: (response: JSONArray?) -> Unit)
    fun get(path:String,completionHandler: (response: JSONObject?) -> Unit)
    fun post(path: String, params: JSONObject, completionHandler: (response: JSONObject?) -> Unit)
}