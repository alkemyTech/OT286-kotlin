package com.melvin.ongandroid.model.repository.Network.retrofit


import com.melvin.ongandroid.model.LogIn
import com.melvin.ongandroid.model.Miembros
import com.melvin.ongandroid.model.Novedad
import com.melvin.ongandroid.model.Register
import com.melvin.ongandroid.view.principal.contacto.ContactosDto
import com.melvin.ongandroid.model.data.*
import com.melvin.ongandroid.model.data.MiembrosData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AlkemyAPIInterface {

    @GET("slides")
    suspend fun getDataWelcomeImages() : Response<WelcomeData>

    @GET("news")
    suspend fun getDataNovedades() : Response<NovedadData<List<Novedad>>>

    @GET("testimonials")
    suspend fun getDataTestimonios() : Response<TestimonioData>

    @GET("activities")
    suspend fun getDataActividades() : Response<ActividadData>

    @GET("members")
    suspend fun getDataMiembros() : Response<MiembrosData<List<Miembros>>>

    @POST("contacts")
    suspend fun setDataContacto(@Body dto : ContactosDto) : Response<ContactosData>

    @POST("login")
    suspend fun setDataLogin(@Body log : LogIn) : Response<LogInData>

    @POST("register")

    suspend fun sendDataRegistro(@Body register : Register) : Response<RegisterData>



}