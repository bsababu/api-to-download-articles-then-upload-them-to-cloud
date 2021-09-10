package mrdp.api.freshservice

interface FsApi {

    val url: String
    fun fetchData(): String
    fun saveData(): String


}