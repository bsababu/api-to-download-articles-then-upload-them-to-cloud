package mrdp.api.freshservice.articles

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import mrdp.api.freshservice.FsApi
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import java.net.http.HttpRequest


class FetchArticle: FsApi {


    val data: String = ""
    override fun fetchData(): String {
        TODO("Not yet implemented")
        url = ""
    }

    override fun saveData(): String {
        TODO("Not yet implemented")
    }



    @PutMapping
    fun updateArticles(){

    }

    @GetMapping
    fun getArticleById(){
        val fetchAllArticlet = runBlocking {

            launch {
                data = HttpRequest()
            }

        }

    }
    @GetMapping
    fun getAllArticle(){
        val fetchAllArticlet = runBlocking {

            launch {

            }

        }
    }
}